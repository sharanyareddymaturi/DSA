# Write your MySQL query statement below
select * from users where
Regexp_like (mail,'^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode\\.com$','c')