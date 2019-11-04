# springboot
 用户登录注册
controller:控制器层，导入service层，调用service方法；通过接受前端传过来的参数进行业务操作，再返回一个指定的路径或数据表
bean/entity/model:实体类，映射数据库中的字段
mapper/dao:放的是对数据库的操作，如CRUD
service:业务层，存放业务逻辑处理；不直接对数据库进行操作，有接口和接口实现类；提供controller层调用的方法
