## 知无涯者V

## 资料
[Spring 文档](https://spring.io/guides/gs/serving-web-content/)

[Spring web 文档](https://spring.io/guides)

[Github deploy key](https://docs.github.com/en/developers/apps/building-oauth-apps/creating-an-oauth-app)

[Bootstrap 文档](https://v3.bootcss.com/getting-started/#download)

[Github OAuth](https://docs.github.com/en/developers/apps/building-oauth-apps/creating-an-oauth-app)

[Spring](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/#boot-features-embedded-database-support)
##  工具

[Visual Paradigm](http://www.visual-paradigm.com)

[okhttp](https://square.github.io/okhttp/)

[H2数据库](https://www.h2database.com/html/main.html)
## 脚本
```sql
create table USER
(
	ID INT auto_increment,
	ACCOUNT_ID VARCHAR(100),
	NAME VARCHAR(50),
	TOKEN CHAR(36),
	GMT_CREATE BIGINT,
	GMT_MODIFIED BIGINT,
	constraint USER_PK
		primary key (ID)
);


```