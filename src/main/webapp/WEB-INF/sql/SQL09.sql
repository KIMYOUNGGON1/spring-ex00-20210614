USE spr1;

create table persistent_logins (
    username varchar(64) not null,
    series varchar(64) primary key,
    token varchar(64) not null,
    last_used timestamp not null
);

DESC persistent_logins;

SELECT * FROM tbl_board;
SELECT * FROM tbl_reply;
SELECT * FROM tbl_member;

UPDATE tbl_board
SET writer = 'member';

UPDATE tbl_reply
SET replyer = 'member';