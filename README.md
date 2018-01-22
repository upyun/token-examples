### UPYUN token 签名生成程序

#### 使用说明

**PHP 版**

```
$etime = time() + 600; // 授权 10 分钟后过期
$key = ''; // token 防盗链密钥
$path = ''; // 文件相对路径
$sign = substr(md5($key.'&'.$etime.'&'.$path), 12, 8).$etime;
```

填写 `$key` `$path` 直接运行即可。

**Java 版**

```
//Token 密钥
private static String KEY = "";
// 文件 URI，如：/100.jpg
private static String PATH = "";
```

填写以上信息，即可运行。

**JS 版**

```
time = new Date();
etime = parseInt(time.getTime() / 1000) + 600;  // 授权10分钟后过期
key = '';   // token防盗链密钥
path = '';  // 文件相对路径
str = hex_md5(key + '&' + etime + '&' + path);
sign = str.substr(12, 8) + etime;
```

**Python 版**

```
etime = str(int(time.time()) + 600)  # 授权 10 分钟后过期
key = ''                             # token 防盗链密钥
path = ''                            # 文件相对路径
sign = md5(key + '&' + etime + '&' + path)[12:20] + etime
```

填写 `key` `path` 直接运行即可。

