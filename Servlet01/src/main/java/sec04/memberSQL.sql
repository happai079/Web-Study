CREATE TABLE member (
		memId VARCHAR(10) NOT NULL PRIMARY KEY,
		memPwd VARCHAR(10),
        memName VARCHAR(30),
        memEmail VARCHAR(30),
        memJoinDate TIMESTAMP DEFAULT NOW()
);

INSERT INTO member 
VALUES('hong', '1234', '홍길동', 'hkd@naver.com', default),
	  ('lee', '1234', '이몽룡', 'lee@naver.com', default),
          ('sch', '1234', '성춘향', 'sch@naver.com', default);

-- 필드 4개만 이용 
INSERT INTO member(memId, memPwd, memName, memEmail)  
VALUES('kim', '1234', '김길동', 'hkd@naver.com');