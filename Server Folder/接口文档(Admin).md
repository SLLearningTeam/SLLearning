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

