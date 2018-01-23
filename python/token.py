# -*- coding: UTF-8 -*-
import hashlib
import time


def md5(value):
    return hashlib.md5(value.encode()).hexdigest()


etime = str(int(time.time()) + 600)  # 授权 10 分钟后过期
key = ''                             # token 防盗链密钥
path = ''                            # 文件相对路径
sign = md5(key + '&' + etime + '&' + path)[12:20] + etime
print sign
