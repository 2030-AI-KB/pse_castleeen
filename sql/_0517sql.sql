SELECT * FROM emp;

SELECT empno, ename, sal, deptno FROM emp;

SELECT empno, ename, sal FROM emp WHERE sal >= 3000 AND sal <= 5000;

SELECT empno, ename, sal FROM emp 
WHERE (sal >= 3000 OR sal <= 1500) AND ENAME LIKE '%L%';

SELECT empno, ename, sal FROM emp 
WHERE (sal >= 3000 OR sal <= 1500) 
ORDER BY sal DESC --asc;

SELECT * FROM EMP
WHERE comm IS NULL;

SELECT * FROM EMP
WHERE comm IS NOT NULL;
-- where empno in (7199, 7499)

-- 0518
-- emp 테이블의 사원 이름 제일 뒤 2글자를 *로 마스킹하여 출력하시오.
-- 1. 사원 이름 끝 2자리를 자르고 출력한다. 
-- 2. 자른 데이터를 rpad의 원본 데이터로 사용한다.
-- 3. **를 채워넣어야 할 이름의 길이을 결정한다.

SELECT empno, ename, rpad(substr(ename, 1, LENGTH(ename)-2), LENGTH(ename), '*') FROM emp;


SELECT SYSDATE AS NOW, SYSDATE-1 AS YESTERDAY, SYSDATE+1 AS TOMORROW FROM DUAL;
SELECT SYSDATE, NEXT_DAY(SYSDATE, '월요일'), LAST_DAY(SYSDATE) FROM DUAL;


SELECT sum(sal) FROM emp;
SELECT count(*) FROM emp where deptno = 30;

-- 0519
SELECT 
	e.empno
	, e.ename
	, e.job
	, e.mgr
	, e.hiredate
	, e.sal
	, e.comm
	, e.deptno
	, d.dname
FROM emp e
INNER JOIN dept d ON e.deptno = d.deptno;

-- 급여가 1500~3000 사이의 사원의
-- FROM EMP e
-- WHERE sal > =1500 AND sal <=3000
-- 사원 번호, 이름, 급여, 부서명을 출력하세요.
-- SELECT empno, ename, sal, dname
-- INNER JOIN dept ON emp.deptno=dept.deptno
-- 출력할 때 급여가 낮은 순으로 출력해 주세요.
-- order by sal asc;

SELECT e.empno, e.ename, e.sal, d.dname
FROM EMP e
INNER JOIN dept d ON e.deptno=d.deptno
WHERE sal > =1500 AND sal <=3000
order by sal asc;

CREATE TABLE emp_detail
(
	tel varchar2(20),
	child number(2),
	age number(3),
	empno number(4)
		CONSTRAINT emp_detail_EMP_EXPNO_fk
			REFERENCES EMP
				ON DELETE CASCADE
)

INSERT INTO emp_detail(tel, child, age, EMPNO)
values('01025555555', 0, 43, 7369);

SELECT * FROM emp_detail;







