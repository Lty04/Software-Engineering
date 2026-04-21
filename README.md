# 外卖点餐系统 (Takeout Ordering System)

## 项目简介

本项目是一个基于 Spring Boot + Vue 3 的外卖点餐系统，实现了完整的在线点餐流程。系统包含用户端和管理端，支持店铺管理、菜品分类、菜品管理、购物车、订单管理等核心功能。

## 技术栈

### 后端 (Backend)
- **框架**: Spring Boot 3.2.0
- **ORM**: MyBatis Plus 3.5.5
- **数据库**: MySQL
- **认证**: JWT (io.jsonwebtoken 0.12.3)
- **工具库**: Hutool 5.8.23
- **其他**: Lombok, Spring Validation
- **JDK 版本**: Java 17

### 前端 (Frontend)
- **框架**: Vue 3
- **状态管理**: Pinia/Vuex
- **路由**: Vue Router
- **UI 组件**: (根据实际项目补充)
- **HTTP 客户端**: Axios

## 项目结构

```
takeout-system/
├── backend/                 # 后端项目
│   ├── src/main/java/      # Java 源代码
│   │   └── com/takeout/
│   │       ├── controller/ # 控制器层
│   │       ├── service/    # 服务层
│   │       ├── mapper/     # 数据访问层
│   │       ├── entity/     # 实体类
│   │       ├── dto/        # 数据传输对象
│   │       └── common/     # 公共类（结果封装、异常处理等）
│   ├── src/main/resources/ # 配置文件
│   │   ├── application.yml # 应用配置
│   │   └── mapper/         # MyBatis XML 映射文件
│   └── pom.xml             # Maven 配置文件
├── frontend/               # 前端项目
│   └── src/
│       ├── api/           # API 接口定义
│       ├── components/    # 公共组件
│       ├── router/        # 路由配置
│       ├── store/         # 状态管理
│       └── views/         # 页面视图
└── docs/                  # 项目文档
```

## 主要功能模块

### 1. 分类管理 (Category)
- 根据店铺 ID 获取分类列表
- 分类的增删改查（管理端）

### 2. 菜品管理 (Dish)
- 菜品的浏览、搜索
- 菜品的增删改查（管理端）
- 菜品规格管理

### 3. 购物车 (Shopping Cart)
- 添加商品到购物车
- 修改购物车商品数量
- 清空购物车

### 4. 订单管理 (Order)
- 创建订单
- 订单查询
- 订单状态更新

### 5. 用户管理 (User)
- 用户注册/登录
- 用户信息管理

## 快速开始

### 环境要求
- JDK 17+
- Maven 3.6+
- MySQL 8.0+
- Node.js 16+ (前端)

### 后端启动

1. 进入后端目录：
```bash
cd takeout-system/backend
```

2. 修改配置文件 `src/main/resources/application.yml`，配置数据库连接信息：
```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/takeout_db?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai
    username: your_username
    password: your_password
```

3. 创建数据库并导入初始数据（如有）：
```sql
CREATE DATABASE takeout_db CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
```

4. 使用 Maven 构建并启动：
```bash
mvn clean install
mvn spring-boot:run
```

后端服务默认运行在：`http://localhost:8080`

### 前端启动

1. 进入前端目录：
```bash
cd takeout-system/frontend
```

2. 安装依赖：
```bash
npm install
```

3. 修改 API 请求基础地址（如需要）：
```bash
# 编辑 src/api/index.js 或相关配置文件
```

4. 启动开发服务器：
```bash
npm run dev
```

前端服务默认运行在：`http://localhost:3000` (具体端口查看终端输出)

## API 接口文档

### 分类接口
- `GET /api/category/list?shopId={shopId}` - 获取分类列表

### 菜品接口
- `GET /api/dish/list` - 获取菜品列表
- `POST /api/dish` - 创建菜品
- `PUT /api/dish` - 更新菜品
- `DELETE /api/dish/{id}` - 删除菜品

### 订单接口
- `POST /api/order` - 创建订单
- `GET /api/order/{id}` - 查询订单详情
- `GET /api/order/list` - 订单列表

### 用户接口
- `POST /api/user/login` - 用户登录
- `POST /api/user/register` - 用户注册

## 开发说明

### 后端开发规范
- Controller 层负责接收请求和返回响应
- Service 层负责业务逻辑处理
- Mapper 层负责数据访问
- 统一使用 `Result<T>` 封装返回结果
- 使用 JWT 进行身份认证

### 前端开发规范
- 使用 Composition API 编写组件
- 统一管理 API 接口在 `src/api/` 目录下
- 使用 Vuex/Pinia 进行状态管理
- 路由守卫处理登录验证

## 常见问题

1. **数据库连接失败**
   - 检查 MySQL 服务是否启动
   - 检查 `application.yml` 中的数据库配置是否正确
   - 确保数据库已创建

2. **跨域问题**
   - 后端已配置 CORS，如需调整请查看 `WebMvcConfigurer` 配置

3. **JWT 认证失败**
   - 检查请求头是否携带正确的 Token
   - 检查 Token 是否过期

## 贡献指南

欢迎提交 Issue 和 Pull Request 来帮助改进本项目。

## 许可证

本项目采用 MIT 许可证。

## 联系方式

如有问题，请通过 Issue 反馈。
