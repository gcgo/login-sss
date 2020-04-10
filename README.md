# 大作业二：需求：实现登录页面（简易版即可）

实现登录验证功能、登录之后跳转到列表页，查询出 tb_resume 表【表数据和课上保持一致】的所有数据（列表不要求分页，在列表右上方有“新增”按钮，每一行后面有“编辑”和“删除”按钮，并实现功能），如果未登录就访问url则跳转到登录页面，用户名和密码固定为admin/admin
技术要求：根据SSM整合的思路，进行SSS整合（Spring+SpringMVC+SpringDataJPA）,登录验证使用SpringMVC拦截器实现
【提交时统一数据库名test，用户名和密码root】

## 项目提交说明：

- 默认地址：http://localhost:8080/，进入首页，只有一个按钮："查看简历"，点击按钮进入登录页面

  ![image-20200410171556235](https://github.com/gcgo/login-sss/blob/master/img/image-20200410171556235.png)

- 登录用户名：admin，密码：admin，输入错误跳回登录页面重新输入

  ![image-20200410171649111](https://github.com/gcgo/login-sss/blob/master/img/image-20200410171649111.png)

- 实现resume表的增删改查

  ![image-20200410171710226](https://github.com/gcgo/login-sss/blob/master/img/image-20200410171710226.png)

