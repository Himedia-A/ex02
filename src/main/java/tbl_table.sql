create SEQUENCE seq_board;

create table tbl_board(
bno number(10,0),
title varchar2(200) not null,
content varchar2(2000) not null,
writer varchar2(50) not null,
regdate date default sysdate,
updatedate date default sysdate
);

alter table tbl_board add constraint pk_board
primary key (bno);

insert into tbl_board (bno,title,content,writer)values(1,'�׽�Ʈ����','�׽�Ʈ����','user00');
insert into tbl_board (bno,title,content,writer)values(2,'�׽�Ʈ����','�׽�Ʈ����','user01');
insert into tbl_board (bno,title,content,writer)values(3,'�׽�Ʈ����','�׽�Ʈ����','user02');
insert into tbl_board (bno,title,content,writer)values(4,'�׽�Ʈ����','�׽�Ʈ����','user03');
insert into tbl_board (bno,title,content,writer)values(5,'�׽�Ʈ����','�׽�Ʈ����','user04');

select * from tbl_board;
commit;