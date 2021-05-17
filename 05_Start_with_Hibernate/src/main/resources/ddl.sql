USE library;

delete from author where id > 6;

ALTER TABLE author AUTO_INCREMENT = 6;