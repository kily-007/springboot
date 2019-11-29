/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.26 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `user` (
	`id` int (10),
	`username` varchar (60),
	`password` varchar (96),
	`sex` varchar (12),
	`phone` varchar (96),
	`email` varchar (96),
	`employer` varchar (96),
	`remarks` varchar (3000)
); 
insert into `user` (`id`, `username`, `password`, `sex`, `phone`, `email`, `employer`, `remarks`) values('1','mrchen','123','女','15272561671','1286759467@qq.com','武汉理工',NULL);
insert into `user` (`id`, `username`, `password`, `sex`, `phone`, `email`, `employer`, `remarks`) values('2','zy','123','女','15272561671','1286759467@qq.com','武汉理工',NULL);
insert into `user` (`id`, `username`, `password`, `sex`, `phone`, `email`, `employer`, `remarks`) values('3','mdf','123','女','15272561671','1286759467@qq.com','武汉理工',NULL);
insert into `user` (`id`, `username`, `password`, `sex`, `phone`, `email`, `employer`, `remarks`) values('4','cjh','123','女','15272561671','1286759467@qq.com','武汉理工',NULL);
insert into `user` (`id`, `username`, `password`, `sex`, `phone`, `email`, `employer`, `remarks`) values('5','123','123','女','15272561671','1286759467@qq.com','武汉理工',NULL);
insert into `user` (`id`, `username`, `password`, `sex`, `phone`, `email`, `employer`, `remarks`) values('6','234','123','男','15272561671','1286759467@qq.com','武汉理工',NULL);
insert into `user` (`id`, `username`, `password`, `sex`, `phone`, `email`, `employer`, `remarks`) values('7','23','123','男','','','',NULL);
insert into `user` (`id`, `username`, `password`, `sex`, `phone`, `email`, `employer`, `remarks`) values('8','lm','123','男','15272561671','1286759467@qq.com','武汉理工',NULL);
insert into `user` (`id`, `username`, `password`, `sex`, `phone`, `email`, `employer`, `remarks`) values('9','wf','123','男','15272561671','1286759467@qq.com','武汉理工',NULL);
insert into `user` (`id`, `username`, `password`, `sex`, `phone`, `email`, `employer`, `remarks`) values('10','aly','123','男','15272561671','1286759467@qq.com','武汉理工',NULL);
insert into `user` (`id`, `username`, `password`, `sex`, `phone`, `email`, `employer`, `remarks`) values('11','jr','123','男','15272561671','1286759467@qq.com','武汉理工',NULL);
insert into `user` (`id`, `username`, `password`, `sex`, `phone`, `email`, `employer`, `remarks`) values('12','wj','123','男','15272561671','1286759467@qq.com','武汉理工',NULL);
