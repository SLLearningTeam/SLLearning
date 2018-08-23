## 接口文档（用户）

### 1.用户获取语言信息

#### 1.1 功能描述

用户获取语言信息

#### 1.2 请求说明

> 请求方式：GET
> 请求URL ：/language/user/getlanguages/{pageNum}
>
> URL参数含义：pageNum表示当前页号

#### 1.3 请求参数

无

#### 1.4 返回结果接收

```json  
{
    "status": true,
    "info": [
        {
            "languageTypeId": 4,
            "languageName": "英文",
            "languageIconUrl": "/SSLearningTeam/Languages/2fe400c5-94fe-48e7-b01c-4531a9228dbe_language.png"
        },
        {
            "languageTypeId": 5,
            "languageName": "中文",
            "languageIconUrl": "/SSLearningTeam/Languages/987a7e8a-7815-4b46-82ab-c870eeaf7510_language.png"
        }
    ]
}
```

#### 1.5 返回参数

| 字段            | 字段类型 | 字段说明         |
| --------------- | -------- | ---------------- |
| languageTypeId  | Int      | 语言类别Id       |
| languageName    | string   | 语言类别名称     |
| languageIconUrl | string   | 语言类别图标地址 |

### 2.用户获取种类类别信息

#### 1.1 功能描述

用户获取种类类别信息

#### 1.2 请求说明

> 请求方式：GET
> 请求URL ：/language/user/getratetypes/{pageNum} 
>
> URL参数含义：pageNum表示当前页号

#### 1.3 请求参数

无

#### 1.4 返回结果接收

```json  
{
    "status": true,
    "info": [
        {
            "rateTypeId": 2,
            "languageType": {
                "languageTypeId": 4,
                "languageName": "英文",
                "languageIconUrl": "/SSLearningTeam/Languages/2fe400c5-94fe-48e7-b01c-4531a9228dbe_language.png"
            },
            "rateName": "六级",
            "rateIconUrl": "/SSLearningTeam/Ratetypes/28b165d6-7441-4af4-beb0-916939e90614_ratetype.png"
        }
    ]
}
```

#### 1.5 返回参数

| 字段            | 字段类型 | 字段说明         |
| --------------- | -------- | ---------------- |
| languageTypeId  | Int      | 语言类别Id       |
| languageName    | string   | 语言类别名称     |
| languageIconUrl | string   | 语言类别图标地址 |
| rateTypeId      | Int      | 类别类型Id       |
| rateName        | string   | 类别类型名称     |
| rateIconUrl     | string   | 类别类型图标Url  |





