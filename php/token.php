<?php
$etime = time() + 600; // 授权 10 分钟后过期
$key = ''; // token 防盗链密钥
$path = ''; // 文件相对路径
$sign = substr(md5($key.'&'.$etime.'&'.$path), 12, 8).$etime;
echo $sign;
