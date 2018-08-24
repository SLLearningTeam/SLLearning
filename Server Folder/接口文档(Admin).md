## 接口文档（管理员）

### 1.管理员打开种类类别添加页面

#### 请求地址

> URL：/ratetype/admin/toaddratetypes 

#### 显示内容

> 显示种类类别添加页面

### 2.管理员添加种类类别接口

#### 请求地址

> URL：/ratetype/admin/addratetypes

#### 请求参数

| 字段名称       | 字段类型 |
| -------------- | -------- |
| languageTypeId | int      |
| rateName       | string   |
| rateIcon       | file     |

#### 显示内容

> 重定向到种类类别列表页面 

### 3.管理员查看种类类别列表

#### 请求地址

> URL：/ratetype/admin/ratetypes_manage/{pageNum}
>
> pageNum：页号 

#### 请求参数

无

#### 显示内容

> 显示种类类别列表
>
> rateTypes为种类类别数组对象
>
> pageNumber为页号总数
>
> currentPage为当前页号数

### 4.管理员获取种类类别修改页面

#### 请求地址

> URL：/ratetype/admin/toupdateratetypes

#### 请求参数

| 字段名称   | 字段类型 |
| ---------- | -------- |
| rateTypeId | int      |

#### 显示内容

> 表单回显的种类类别修改页面
>
> rateType为要修改的种类类别信息

### 5.管理员删除种类类别接口

#### 请求地址

> URL：/ratetype/admin/deleteratetype

#### 请求参数

| 字段名称   | 字段类型 |
| ---------- | -------- |
| rateTypeId | int      |

#### 响应字段内容

| 字段名称 | 字段类型 |
| -------- | -------- |
| status   | boolean  |
| iinfo    | string   |

#### 响应实例

```json
{
    "status": true,
    "info": "删除成功"
}
```

### 6.管理员修改种类类别接口

#### 请求地址

> URL：/ratetype/admin/updateratetype 

#### 请求参数

| 字段名称       | 字段类型 |
| -------------- | -------- |
| languageTypeId | int      |
| rateName       | string   |
| rateIcon       | file     |
| rateTypeId     | int      |

#### 显示内容

> 重定向到种类类别列表页面

### 7.获取管理员添加听力课程页面

#### 请求地址

> URL：/course/admin/toAddListeningCourse 

#### 请求参数

无

#### 显示内容

> 显示管理员添加听力课程页面

### 8.获取管理员添加口语课程页面

#### 请求地址

> URL：/course/admin/toAddOralCourse 

#### 请求参数

无

#### 显示内容

> 显示管理员添加口语课程页面

### 9.获取管理员添加阅读课程页面

#### 请求地址

> URL：/course/admin/toAddReadingCourse 

#### 请求参数

无

#### 显示内容

> 显示管理员添加阅读课程页面

### 10.管理员添加听力课程接口

#### 请求地址

> URL：/course/admin/toAddListeningCourse 

#### 请求参数

| 字段名称             | 字段类型 |
| -------------------- | -------- |
| languageTypeId       | int      |
| rateTypeId           | int      |
| courseName           | string   |
| courseChineseContent | string   |
| courseEnglishContent | string   |
| courseResource       | file     |
| instructionImg       | file     |

#### 显示内容

> 重定向到综合课程显示列表页面

### 11.管理员添加口语课程接口

#### 请求地址

> URL：/course/admin/toAddOralCourse  

#### 请求参数

| 字段名称             | 字段类型 |
| -------------------- | -------- |
| languageTypeId       | int      |
| rateTypeId           | int      |
| courseName           | string   |
| courseChineseContent | string   |
| courseEnglishContent | string   |
| instructionImg       | file     |

#### 显示内容

> 重定向到综合课程显示列表页面

### 12.管理员添加阅读课程接口

#### 请求地址

> URL：/course/admin/toAddReadingCourse 

#### 请求参数

| 字段名称             | 字段类型 |
| -------------------- | -------- |
| languageTypeId       | int      |
| rateTypeId           | int      |
| courseName           | string   |
| courseChineseContent | string   |
| courseEnglishContent | string   |
| instructionImg       | file     |

#### 显示内容

> 重定向到综合课程显示列表页面

### 13.管理员通过语言获取种类类别信息[实现表单选择时的二级联动]

#### 13.1 功能描述

管理员通过语言获取种类类别信息

#### 13.2 请求说明

> 请求方式：GET
> 请求URL ：/ratetype/user/getratetypebylanguagetypeid 

#### 13.3 请求参数

| 字段           | 字段类型 | 字段说明   |
| -------------- | -------- | ---------- |
| languageTypeId | int      | 语言类别Id |

#### 13.4 返回结果接收

```json  
{
    "status": true,
    "info": [
        {
            "rateTypeId": 2,
            "languageTypeId": 5,
            "rateName": "二级",
            "rateIconUrl": "/SSLearningTeam/Ratetypes/28b165d6-7441-4af4-beb0-916939e90614_ratetype.png"
        }
    ]
}
```

#### 13.5 返回参数

| 字段           | 字段类型 | 字段说明    |
| -------------- | -------- | ----------- |
| rateTypeId     | Int      | 类别类型Id  |
| languageTypeId | int      | 语言类别Id  |
| rateName       | string   | 类别名称    |
| rateIconUrl    | string   | 类别图标Url |

