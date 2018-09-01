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

### 14.管理员删除听力课程接口

#### 请求地址

> URL：/course/admin/deleteListeningCourse 

#### 请求参数

| 字段名称 | 字段类型 |
| -------- | -------- |
| courseId | int      |

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

### 15.管理员删除口语课程接口

#### 请求地址

> URL：/course/admin/deleteOralCourse 

#### 请求参数

| 字段名称 | 字段类型 |
| -------- | -------- |
| courseId | int      |

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

### 16.管理员删除阅读课程接口

#### 请求地址

> URL：/course/admin/deleteReadingCourse 

#### 请求参数

| 字段名称 | 字段类型 |
| -------- | -------- |
| courseId | int      |

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

### 17.管理员跳转修改听力课程信息页面

#### 请求地址

> URL：/course/admin/toUpdateListeningCourse 

#### 请求参数

| 字段名称 | 字段类型 |
| -------- | -------- |
| courseId | int      |

#### 返回携带内容

| 字段内容        | 字段类型           |
| --------------- | ------------------ |
| pageName        | string             |
| listeningCourse | ListeningCourse    |
| languageTypes   | List<LanguageType> |
| courseId        | Integer            |

### 18.管理员跳转修改口语课程信息页面

#### 请求地址

> URL：/course/admin/toUpdateOralCourse 

#### 请求参数

| 字段名称 | 字段类型 |
| -------- | -------- |
| courseId | int      |

#### 返回携带内容

| 字段内容      | 字段类型           |
| ------------- | ------------------ |
| pageName      | string             |
| oralCourse    | OralCourse         |
| languageTypes | List<LanguageType> |
| courseId      | Integer            |

### 19.管理员跳转修改阅读课程信息页面

#### 请求地址

> URL：/course/admin/toUpdateReadingCourse 

#### 请求参数

| 字段名称 | 字段类型 |
| -------- | -------- |
| courseId | int      |

#### 返回携带内容

| 字段内容      | 字段类型           |
| ------------- | ------------------ |
| pageName      | string             |
| readingCourse | ReadingCourse      |
| languageTypes | List<LanguageType> |
| courseId      | Integer            |

### 20.管理员修改听力课程信息接口

#### 请求地址

> URL：/course/admin/updateListeningCourse 

#### 请求参数

| 字段名称             | 字段类型 |
| -------------------- | -------- |
| courseId             | int      |
| languageTypeId       | int      |
| rateTypeId           | int      |
| courseName           | string   |
| courseChineseContent | string   |
| courseEnglishContent | string   |
| courseResource       | file     |
| downloadNum          | int      |
| instructionImg       | file     |

#### 返回携带内容

无

#### 显示页面

> 重定向到综合显示课程列表

### 21.管理员修改口语课程信息接口

#### 请求地址

> URL：/course/admin/updateOralCourse 

#### 请求参数

| 字段名称             | 字段类型 |
| -------------------- | -------- |
| courseId             | int      |
| languageTypeId       | int      |
| rateTypeId           | int      |
| courseName           | string   |
| courseChineseContent | string   |
| courseEnglishContent | string   |
| downloadNum          | int      |
| instructionImg       | file     |

#### 返回携带内容

无

#### 显示页面

> 重定向到综合显示课程列表

### 22.管理员修改阅读课程信息接口

#### 请求地址

> URL：/course/admin/updateReadingCourse 

#### 请求参数

| 字段名称             | 字段类型 |
| -------------------- | -------- |
| courseId             | int      |
| languageTypeId       | int      |
| rateTypeId           | int      |
| courseName           | string   |
| courseChineseContent | string   |
| courseEnglishContent | string   |
| downloadNum          | int      |
| instructionImg       | file     |

#### 返回携带内容

无

#### 显示页面

> 重定向到综合显示课程列表

### 23.管理员获取综合课程列表页面

#### 请求地址

> URL：/course/admin/courses_manage/{pageNum} 
>
> pageNum表示页号

#### 请求参数

无

#### 返回携带内容

| 字段       | 字段类型 | 字段说明     |
| ---------- | -------- | ------------ |
| totalPages | Int      | 总页数       |
| pageNum    | int      | 当前页数     |
| courses    | Object   | 所有课程对象 |
| pageName   | string   | 页面名称     |

#### 返回包含内容，示例返回演示

```java
courses:{readingCourses=[ReadingCourse [courseId=2, languageType=LanguageType [languageTypeId=5, languageName=中文, languageIconUrl=/SSLearningTeam/Languages/987a7e8a-7815-4b46-82ab-c870eeaf7510_language.png], rateType=RateType [rateTypeId=2, languageType=null, rateName=二级, rateIconUrl=/SSLearningTeam/Ratetypes/28b165d6-7441-4af4-beb0-916939e90614_ratetype.png], courseName=测试阅读1s, courseChineseContent=测试s, courseEnglishContent=tests, downloadNum=2, instructionImgUrl=/SSLearningTeam/ReadingCourseResource/43edaca2-f178-4b6e-baee-d82adaa5d2d11.png]], oralCourses=[OralCourse [courseId=2, languageType=LanguageType [languageTypeId=5, languageName=中文, languageIconUrl=/SSLearningTeam/Languages/987a7e8a-7815-4b46-82ab-c870eeaf7510_language.png], rateType=RateType [rateTypeId=2, languageType=null, rateName=二级, rateIconUrl=/SSLearningTeam/Ratetypes/28b165d6-7441-4af4-beb0-916939e90614_ratetype.png], courseName=测试口语1, courseChineseContent=测试s, courseEnglishContent=tests, downloadNum=3, instructionImgUrl=/SSLearningTeam/OralCourseResource/e428d718-73cb-411a-9fe9-2e7a3b3f5013成功.png]], listeningCourses=[ListeningCourse [courseId=2, languageType=LanguageType [languageTypeId=5, languageName=中文, languageIconUrl=/SSLearningTeam/Languages/987a7e8a-7815-4b46-82ab-c870eeaf7510_language.png], rateType=RateType [rateTypeId=2, languageType=null, rateName=二级, rateIconUrl=/SSLearningTeam/Ratetypes/28b165d6-7441-4af4-beb0-916939e90614_ratetype.png], courseName=测试听力, courseChineseContent=中文, courseEnglishContent=Chinese, courseResourceUrl=/SSLearningTeam/ListeningCourseResource/38693414-c968-4c78-8b84-3c219dc8d79a学员网页端.mp3, downloadNum=0, instructionImgUrl=/SSLearningTeam/ListeningCourseResource/22e3b1a2-0075-494b-850b-67cd18ac57c7中文.png], ListeningCourse [courseId=3, languageType=LanguageType [languageTypeId=5, languageName=中文, languageIconUrl=/SSLearningTeam/Languages/987a7e8a-7815-4b46-82ab-c870eeaf7510_language.png], rateType=RateType [rateTypeId=2, languageType=null, rateName=二级, rateIconUrl=/SSLearningTeam/Ratetypes/28b165d6-7441-4af4-beb0-916939e90614_ratetype.png], courseName=测试听力2, courseChineseContent=英文, courseEnglishContent=English, courseResourceUrl=/SSLearningTeam/ListeningCourseResource/e1f53648-64a0-4b7b-af59-4cee36b8149f学员网页端.mp3, downloadNum=0, instructionImgUrl=/SSLearningTeam/ListeningCourseResource/bed0730d-5012-4e17-8923-a2f952c63bcb英文.png], ListeningCourse [courseId=4, languageType=LanguageType [languageTypeId=5, languageName=中文, languageIconUrl=/SSLearningTeam/Languages/987a7e8a-7815-4b46-82ab-c870eeaf7510_language.png], rateType=RateType [rateTypeId=2, languageType=null, rateName=二级, rateIconUrl=/SSLearningTeam/Ratetypes/28b165d6-7441-4af4-beb0-916939e90614_ratetype.png], courseName=测试听力3, courseChineseContent=听力, courseEnglishContent=listening, courseResourceUrl=/SSLearningTeam/ListeningCourseResource/521bc7f2-c9c5-41b6-96a5-fe6b2c7839f9学员网页端.mp3, downloadNum=0, instructionImgUrl=/SSLearningTeam/ListeningCourseResource/417c1422-94c0-4b2d-831e-22fc97bc7020中文.png], ListeningCourse [courseId=5, languageType=LanguageType [languageTypeId=5, languageName=中文, languageIconUrl=/SSLearningTeam/Languages/987a7e8a-7815-4b46-82ab-c870eeaf7510_language.png], rateType=RateType [rateTypeId=2, languageType=null, rateName=二级, rateIconUrl=/SSLearningTeam/Ratetypes/28b165d6-7441-4af4-beb0-916939e90614_ratetype.png], courseName=测试听力99s, courseChineseContent=啦啦a99ss, courseEnglishContent=lalaa99ss, courseResourceUrl=/SSLearningTeam/ListeningCourseResource/c020b6f7-676a-4650-94bf-9cb660306280学员网页端.mp3, downloadNum=3, instructionImgUrl=/SSLearningTeam/ListeningCourseResource/10520d9e-06c2-46bc-a218-2d42382ea384java.jpeg]]}

totalPages:1

pageNum:1
    
pageName:"courseManage"
```

#### 显示页面

> 综合显示课程列表页面

### 24.管理员获取听力课程列表页面（按照数据库排序顺序）

#### 请求地址

> URL：/course/admin/listeningCourses_manage/{pageNum} 
>
> pageNum表示页号

#### 请求参数

无

#### 返回携带内容

| 字段       | 字段类型 | 字段说明         |
| ---------- | -------- | ---------------- |
| totalPages | Int      | 总页数           |
| pageNum    | int      | 当前页数         |
| courses    | Object   | 所有听力课程对象 |
| pageName   | string   | 页面名称         |

#### 返回包含内容，示例返回演示

```java
pageNum:1

totalPages:1

courses:{readingCourses=[], oralCourses=[], listeningCourses=[ListeningCourse [courseId=2, languageType=LanguageType [languageTypeId=5, languageName=中文, languageIconUrl=/SSLearningTeam/Languages/987a7e8a-7815-4b46-82ab-c870eeaf7510_language.png], rateType=RateType [rateTypeId=2, languageType=null, rateName=二级, rateIconUrl=/SSLearningTeam/Ratetypes/28b165d6-7441-4af4-beb0-916939e90614_ratetype.png], courseName=测试听力, courseChineseContent=中文, courseEnglishContent=Chinese, courseResourceUrl=/SSLearningTeam/ListeningCourseResource/38693414-c968-4c78-8b84-3c219dc8d79a学员网页端.mp3, downloadNum=0, instructionImgUrl=/SSLearningTeam/ListeningCourseResource/22e3b1a2-0075-494b-850b-67cd18ac57c7中文.png], ListeningCourse [courseId=3, languageType=LanguageType [languageTypeId=5, languageName=中文, languageIconUrl=/SSLearningTeam/Languages/987a7e8a-7815-4b46-82ab-c870eeaf7510_language.png], rateType=RateType [rateTypeId=2, languageType=null, rateName=二级, rateIconUrl=/SSLearningTeam/Ratetypes/28b165d6-7441-4af4-beb0-916939e90614_ratetype.png], courseName=测试听力2, courseChineseContent=英文, courseEnglishContent=English, courseResourceUrl=/SSLearningTeam/ListeningCourseResource/e1f53648-64a0-4b7b-af59-4cee36b8149f学员网页端.mp3, downloadNum=0, instructionImgUrl=/SSLearningTeam/ListeningCourseResource/bed0730d-5012-4e17-8923-a2f952c63bcb英文.png], ListeningCourse [courseId=4, languageType=LanguageType [languageTypeId=5, languageName=中文, languageIconUrl=/SSLearningTeam/Languages/987a7e8a-7815-4b46-82ab-c870eeaf7510_language.png], rateType=RateType [rateTypeId=2, languageType=null, rateName=二级, rateIconUrl=/SSLearningTeam/Ratetypes/28b165d6-7441-4af4-beb0-916939e90614_ratetype.png], courseName=测试听力3, courseChineseContent=听力, courseEnglishContent=listening, courseResourceUrl=/SSLearningTeam/ListeningCourseResource/521bc7f2-c9c5-41b6-96a5-fe6b2c7839f9学员网页端.mp3, downloadNum=0, instructionImgUrl=/SSLearningTeam/ListeningCourseResource/417c1422-94c0-4b2d-831e-22fc97bc7020中文.png], ListeningCourse [courseId=5, languageType=LanguageType [languageTypeId=5, languageName=中文, languageIconUrl=/SSLearningTeam/Languages/987a7e8a-7815-4b46-82ab-c870eeaf7510_language.png], rateType=RateType [rateTypeId=2, languageType=null, rateName=二级, rateIconUrl=/SSLearningTeam/Ratetypes/28b165d6-7441-4af4-beb0-916939e90614_ratetype.png], courseName=测试听力99s, courseChineseContent=啦啦a99ss, courseEnglishContent=lalaa99ss, courseResourceUrl=/SSLearningTeam/ListeningCourseResource/c020b6f7-676a-4650-94bf-9cb660306280学员网页端.mp3, downloadNum=3, instructionImgUrl=/SSLearningTeam/ListeningCourseResource/10520d9e-06c2-46bc-a218-2d42382ea384java.jpeg]]}
    
pageName:"courseManage"
```

### 25.管理员获取听力课程列表页面（按照下载量排序顺序）

#### 请求地址

> URL：/course/admin/listeningCourses_manageByDownload/{pageNum} 
>
> pageNum表示页号

#### 请求参数

无

#### 返回携带内容

| 字段       | 字段类型 | 字段说明             |
| ---------- | -------- | -------------------- |
| totalPages | Int      | 总页数               |
| pageNum    | int      | 当前页数             |
| courses    | Object   | 筛选后的听力课程对象 |
| pageName   | string   | 页面名称             |

#### 返回包含内容，示例返回演示

```java
pageNum:1

totalPages:1

courses:{readingCourses=[], oralCourses=[], listeningCourses=[ListeningCourse [courseId=4, languageType=LanguageType [languageTypeId=5, languageName=中文, languageIconUrl=/SSLearningTeam/Languages/987a7e8a-7815-4b46-82ab-c870eeaf7510_language.png], rateType=RateType [rateTypeId=2, languageType=null, rateName=二级, rateIconUrl=/SSLearningTeam/Ratetypes/28b165d6-7441-4af4-beb0-916939e90614_ratetype.png], courseName=测试听力3, courseChineseContent=听力, courseEnglishContent=listening, courseResourceUrl=/SSLearningTeam/ListeningCourseResource/521bc7f2-c9c5-41b6-96a5-fe6b2c7839f9学员网页端.mp3, downloadNum=5, instructionImgUrl=/SSLearningTeam/ListeningCourseResource/417c1422-94c0-4b2d-831e-22fc97bc7020中文.png], ListeningCourse [courseId=2, languageType=LanguageType [languageTypeId=5, languageName=中文, languageIconUrl=/SSLearningTeam/Languages/987a7e8a-7815-4b46-82ab-c870eeaf7510_language.png], rateType=RateType [rateTypeId=2, languageType=null, rateName=二级, rateIconUrl=/SSLearningTeam/Ratetypes/28b165d6-7441-4af4-beb0-916939e90614_ratetype.png], courseName=测试听力, courseChineseContent=中文, courseEnglishContent=Chinese, courseResourceUrl=/SSLearningTeam/ListeningCourseResource/38693414-c968-4c78-8b84-3c219dc8d79a学员网页端.mp3, downloadNum=4, instructionImgUrl=/SSLearningTeam/ListeningCourseResource/22e3b1a2-0075-494b-850b-67cd18ac57c7中文.png], ListeningCourse [courseId=5, languageType=LanguageType [languageTypeId=5, languageName=中文, languageIconUrl=/SSLearningTeam/Languages/987a7e8a-7815-4b46-82ab-c870eeaf7510_language.png], rateType=RateType [rateTypeId=2, languageType=null, rateName=二级, rateIconUrl=/SSLearningTeam/Ratetypes/28b165d6-7441-4af4-beb0-916939e90614_ratetype.png], courseName=测试听力99s, courseChineseContent=啦啦a99ss, courseEnglishContent=lalaa99ss, courseResourceUrl=/SSLearningTeam/ListeningCourseResource/c020b6f7-676a-4650-94bf-9cb660306280学员网页端.mp3, downloadNum=3, instructionImgUrl=/SSLearningTeam/ListeningCourseResource/10520d9e-06c2-46bc-a218-2d42382ea384java.jpeg], ListeningCourse [courseId=3, languageType=LanguageType [languageTypeId=5, languageName=中文, languageIconUrl=/SSLearningTeam/Languages/987a7e8a-7815-4b46-82ab-c870eeaf7510_language.png], rateType=RateType [rateTypeId=2, languageType=null, rateName=二级, rateIconUrl=/SSLearningTeam/Ratetypes/28b165d6-7441-4af4-beb0-916939e90614_ratetype.png], courseName=测试听力2, courseChineseContent=英文, courseEnglishContent=English, courseResourceUrl=/SSLearningTeam/ListeningCourseResource/e1f53648-64a0-4b7b-af59-4cee36b8149f学员网页端.mp3, downloadNum=1, instructionImgUrl=/SSLearningTeam/ListeningCourseResource/bed0730d-5012-4e17-8923-a2f952c63bcb英文.png]]}
    
pageName:"courseManage"
```

### 26.管理员获取筛选指定语言类别的听力课程列表 

#### 请求地址

> URL：/course/admin/listeningCourses_manageByLanguageType/{pageNum} 
>
> pageNum表示页号

#### 请求参数

| 字段           | 字段类型 | 字段说明   |
| -------------- | -------- | ---------- |
| languageTypeId | int      | 语言类别Id |

#### 返回携带内容

| 字段       | 字段类型 | 字段说明             |
| ---------- | -------- | -------------------- |
| totalPages | Int      | 总页数               |
| pageNum    | int      | 当前页数             |
| courses    | Object   | 筛选后的听力课程对象 |
| pageName   | string   | 页面名称             |

#### 返回包含内容，示例返回演示

```java
pageNum:1

totalPages:1

courses:{readingCourses=[], oralCourses=[], listeningCourses=[ListeningCourse [courseId=2, languageType=LanguageType [languageTypeId=5, languageName=中文, languageIconUrl=/SSLearningTeam/Languages/987a7e8a-7815-4b46-82ab-c870eeaf7510_language.png], rateType=RateType [rateTypeId=2, languageType=null, rateName=二级, rateIconUrl=/SSLearningTeam/Ratetypes/28b165d6-7441-4af4-beb0-916939e90614_ratetype.png], courseName=测试听力, courseChineseContent=中文, courseEnglishContent=Chinese, courseResourceUrl=/SSLearningTeam/ListeningCourseResource/38693414-c968-4c78-8b84-3c219dc8d79a学员网页端.mp3, downloadNum=4, instructionImgUrl=/SSLearningTeam/ListeningCourseResource/22e3b1a2-0075-494b-850b-67cd18ac57c7中文.png], ListeningCourse [courseId=3, languageType=LanguageType [languageTypeId=5, languageName=中文, languageIconUrl=/SSLearningTeam/Languages/987a7e8a-7815-4b46-82ab-c870eeaf7510_language.png], rateType=RateType [rateTypeId=2, languageType=null, rateName=二级, rateIconUrl=/SSLearningTeam/Ratetypes/28b165d6-7441-4af4-beb0-916939e90614_ratetype.png], courseName=测试听力2, courseChineseContent=英文, courseEnglishContent=English, courseResourceUrl=/SSLearningTeam/ListeningCourseResource/e1f53648-64a0-4b7b-af59-4cee36b8149f学员网页端.mp3, downloadNum=1, instructionImgUrl=/SSLearningTeam/ListeningCourseResource/bed0730d-5012-4e17-8923-a2f952c63bcb英文.png], ListeningCourse [courseId=4, languageType=LanguageType [languageTypeId=5, languageName=中文, languageIconUrl=/SSLearningTeam/Languages/987a7e8a-7815-4b46-82ab-c870eeaf7510_language.png], rateType=RateType [rateTypeId=2, languageType=null, rateName=二级, rateIconUrl=/SSLearningTeam/Ratetypes/28b165d6-7441-4af4-beb0-916939e90614_ratetype.png], courseName=测试听力3, courseChineseContent=听力, courseEnglishContent=listening, courseResourceUrl=/SSLearningTeam/ListeningCourseResource/521bc7f2-c9c5-41b6-96a5-fe6b2c7839f9学员网页端.mp3, downloadNum=5, instructionImgUrl=/SSLearningTeam/ListeningCourseResource/417c1422-94c0-4b2d-831e-22fc97bc7020中文.png], ListeningCourse [courseId=5, languageType=LanguageType [languageTypeId=5, languageName=中文, languageIconUrl=/SSLearningTeam/Languages/987a7e8a-7815-4b46-82ab-c870eeaf7510_language.png], rateType=RateType [rateTypeId=2, languageType=null, rateName=二级, rateIconUrl=/SSLearningTeam/Ratetypes/28b165d6-7441-4af4-beb0-916939e90614_ratetype.png], courseName=测试听力99s, courseChineseContent=啦啦a99ss, courseEnglishContent=lalaa99ss, courseResourceUrl=/SSLearningTeam/ListeningCourseResource/c020b6f7-676a-4650-94bf-9cb660306280学员网页端.mp3, downloadNum=3, instructionImgUrl=/SSLearningTeam/ListeningCourseResource/10520d9e-06c2-46bc-a218-2d42382ea384java.jpeg]]}
    
pageName:"courseManage"
```

### 27.管理员获取筛选指定种类类别(种类类别已经确定了语言类别)的听力课程列表

#### 请求地址

> URL：/course/admin/listeningCourses_manageByRateType/{pageNum} 
>
> pageNum表示页号

#### 请求参数

| 字段       | 字段类型 | 字段说明   |
| ---------- | -------- | ---------- |
| rateTypeId | int      | 种类类别Id |

#### 返回携带内容

| 字段       | 字段类型 | 字段说明             |
| ---------- | -------- | -------------------- |
| totalPages | Int      | 总页数               |
| pageNum    | int      | 当前页数             |
| courses    | Object   | 筛选后的听力课程对象 |
| pageName   | string   | 页面名称             |

#### 返回包含内容，示例返回演示

```java
pageNum:1

totalPages:1

courses:{readingCourses=[], oralCourses=[], listeningCourses=[ListeningCourse [courseId=2, languageType=LanguageType [languageTypeId=5, languageName=中文, languageIconUrl=/SSLearningTeam/Languages/987a7e8a-7815-4b46-82ab-c870eeaf7510_language.png], rateType=RateType [rateTypeId=2, languageType=null, rateName=二级, rateIconUrl=/SSLearningTeam/Ratetypes/28b165d6-7441-4af4-beb0-916939e90614_ratetype.png], courseName=测试听力, courseChineseContent=中文, courseEnglishContent=Chinese, courseResourceUrl=/SSLearningTeam/ListeningCourseResource/38693414-c968-4c78-8b84-3c219dc8d79a学员网页端.mp3, downloadNum=4, instructionImgUrl=/SSLearningTeam/ListeningCourseResource/22e3b1a2-0075-494b-850b-67cd18ac57c7中文.png], ListeningCourse [courseId=3, languageType=LanguageType [languageTypeId=5, languageName=中文, languageIconUrl=/SSLearningTeam/Languages/987a7e8a-7815-4b46-82ab-c870eeaf7510_language.png], rateType=RateType [rateTypeId=2, languageType=null, rateName=二级, rateIconUrl=/SSLearningTeam/Ratetypes/28b165d6-7441-4af4-beb0-916939e90614_ratetype.png], courseName=测试听力2, courseChineseContent=英文, courseEnglishContent=English, courseResourceUrl=/SSLearningTeam/ListeningCourseResource/e1f53648-64a0-4b7b-af59-4cee36b8149f学员网页端.mp3, downloadNum=1, instructionImgUrl=/SSLearningTeam/ListeningCourseResource/bed0730d-5012-4e17-8923-a2f952c63bcb英文.png], ListeningCourse [courseId=4, languageType=LanguageType [languageTypeId=5, languageName=中文, languageIconUrl=/SSLearningTeam/Languages/987a7e8a-7815-4b46-82ab-c870eeaf7510_language.png], rateType=RateType [rateTypeId=2, languageType=null, rateName=二级, rateIconUrl=/SSLearningTeam/Ratetypes/28b165d6-7441-4af4-beb0-916939e90614_ratetype.png], courseName=测试听力3, courseChineseContent=听力, courseEnglishContent=listening, courseResourceUrl=/SSLearningTeam/ListeningCourseResource/521bc7f2-c9c5-41b6-96a5-fe6b2c7839f9学员网页端.mp3, downloadNum=5, instructionImgUrl=/SSLearningTeam/ListeningCourseResource/417c1422-94c0-4b2d-831e-22fc97bc7020中文.png], ListeningCourse [courseId=5, languageType=LanguageType [languageTypeId=5, languageName=中文, languageIconUrl=/SSLearningTeam/Languages/987a7e8a-7815-4b46-82ab-c870eeaf7510_language.png], rateType=RateType [rateTypeId=2, languageType=null, rateName=二级, rateIconUrl=/SSLearningTeam/Ratetypes/28b165d6-7441-4af4-beb0-916939e90614_ratetype.png], courseName=测试听力99s, courseChineseContent=啦啦a99ss, courseEnglishContent=lalaa99ss, courseResourceUrl=/SSLearningTeam/ListeningCourseResource/c020b6f7-676a-4650-94bf-9cb660306280学员网页端.mp3, downloadNum=3, instructionImgUrl=/SSLearningTeam/ListeningCourseResource/10520d9e-06c2-46bc-a218-2d42382ea384java.jpeg]]}

pageName:"courseManage"
```

### 28.管理员获取口语课程列表页面（按照数据库排序顺序）

#### 请求地址

> URL：/course/admin/oralCourses_manage/{pageNum}  
>
> pageNum表示页号

#### 请求参数

无

#### 返回携带内容

| 字段       | 字段类型 | 字段说明         |
| ---------- | -------- | ---------------- |
| totalPages | Int      | 总页数           |
| pageNum    | int      | 当前页数         |
| courses    | Object   | 所有口语课程对象 |
| pageName   | string   | 页面名称         |

#### 返回包含内容，示例返回演示

```java
pageNum:1

totalPages:1

courses:{readingCourses=[], oralCourses=[OralCourse [courseId=2, languageType=LanguageType [languageTypeId=5, languageName=中文, languageIconUrl=/SSLearningTeam/Languages/987a7e8a-7815-4b46-82ab-c870eeaf7510_language.png], rateType=RateType [rateTypeId=2, languageType=null, rateName=二级, rateIconUrl=/SSLearningTeam/Ratetypes/28b165d6-7441-4af4-beb0-916939e90614_ratetype.png], courseName=测试口语1, courseChineseContent=测试s, courseEnglishContent=tests, downloadNum=3, instructionImgUrl=/SSLearningTeam/OralCourseResource/e428d718-73cb-411a-9fe9-2e7a3b3f5013成功.png]], listeningCourses=[]}
    
pageName:"courseManage"
```

### 29.管理员获取口语课程列表页面（按照下载量排序顺序）

#### 请求地址

> URL：/course/admin/oralCourses_manageByDownload/{pageNum} 
>
> pageNum表示页号

#### 请求参数

无

#### 返回携带内容

| 字段       | 字段类型 | 字段说明             |
| ---------- | -------- | -------------------- |
| totalPages | Int      | 总页数               |
| pageNum    | int      | 当前页数             |
| courses    | Object   | 筛选后的口语课程对象 |
| pageName   | string   | 页面名称             |

#### 返回包含内容，示例返回演示

```java
pageNum:1

totalPages:1

courses:{readingCourses=[], oralCourses=[OralCourse [courseId=2, languageType=LanguageType [languageTypeId=5, languageName=中文, languageIconUrl=/SSLearningTeam/Languages/987a7e8a-7815-4b46-82ab-c870eeaf7510_language.png], rateType=RateType [rateTypeId=2, languageType=null, rateName=二级, rateIconUrl=/SSLearningTeam/Ratetypes/28b165d6-7441-4af4-beb0-916939e90614_ratetype.png], courseName=测试口语1, courseChineseContent=测试s, courseEnglishContent=tests, downloadNum=3, instructionImgUrl=/SSLearningTeam/OralCourseResource/e428d718-73cb-411a-9fe9-2e7a3b3f5013成功.png]], listeningCourses=[]}
    
pageName:"courseManage"
```

### 30.管理员获取筛选指定语言类别的口语课程列表 

#### 请求地址

> URL：/course/admin/oralCourses_manageByLanguageType/{pageNum} 
>
> pageNum表示页号

#### 请求参数

| 字段           | 字段类型 | 字段说明   |
| -------------- | -------- | ---------- |
| languageTypeId | int      | 语言类别Id |

#### 返回携带内容

| 字段       | 字段类型 | 字段说明             |
| ---------- | -------- | -------------------- |
| totalPages | Int      | 总页数               |
| pageNum    | int      | 当前页数             |
| courses    | Object   | 筛选后的听力课程对象 |
| pageName   | string   | 页面名称             |

#### 返回包含内容，示例返回演示

```java
pageNum:1

totalPages:1

courses:{readingCourses=[], oralCourses=[OralCourse [courseId=2, languageType=LanguageType [languageTypeId=5, languageName=中文, languageIconUrl=/SSLearningTeam/Languages/987a7e8a-7815-4b46-82ab-c870eeaf7510_language.png], rateType=RateType [rateTypeId=2, languageType=null, rateName=二级, rateIconUrl=/SSLearningTeam/Ratetypes/28b165d6-7441-4af4-beb0-916939e90614_ratetype.png], courseName=测试口语1, courseChineseContent=测试s, courseEnglishContent=tests, downloadNum=3, instructionImgUrl=/SSLearningTeam/OralCourseResource/e428d718-73cb-411a-9fe9-2e7a3b3f5013成功.png]], listeningCourses=[]}
    
pageName:"courseManage"
```

### 31.管理员获取筛选指定种类类别(种类类别已经确定了语言类别)的口语课程列表

#### 请求地址

> URL：/course/admin/oralCourses_manageByRateType/{pageNum} 
>
> pageNum表示页号

#### 请求参数

| 字段       | 字段类型 | 字段说明   |
| ---------- | -------- | ---------- |
| rateTypeId | int      | 种类类别Id |

#### 返回携带内容

| 字段       | 字段类型 | 字段说明             |
| ---------- | -------- | -------------------- |
| totalPages | Int      | 总页数               |
| pageNum    | int      | 当前页数             |
| courses    | Object   | 筛选后的口语课程对象 |
| pageName   | string   | 页面名称             |

#### 返回包含内容，示例返回演示

```java
pageNum:1

totalPages:1

courses:{readingCourses=[], oralCourses=[OralCourse [courseId=2, languageType=LanguageType [languageTypeId=5, languageName=中文, languageIconUrl=/SSLearningTeam/Languages/987a7e8a-7815-4b46-82ab-c870eeaf7510_language.png], rateType=RateType [rateTypeId=2, languageType=null, rateName=二级, rateIconUrl=/SSLearningTeam/Ratetypes/28b165d6-7441-4af4-beb0-916939e90614_ratetype.png], courseName=测试口语1, courseChineseContent=测试s, courseEnglishContent=tests, downloadNum=3, instructionImgUrl=/SSLearningTeam/OralCourseResource/e428d718-73cb-411a-9fe9-2e7a3b3f5013成功.png]], listeningCourses=[]}

pageName:"courseManage"
```

### 32.管理员获取阅读课程列表页面（按照数据库排序顺序）

#### 请求地址

> URL：/course/admin/readingCourses_manage/{pageNum} 
>
> pageNum表示页号

#### 请求参数

无

#### 返回携带内容

| 字段       | 字段类型 | 字段说明         |
| ---------- | -------- | ---------------- |
| totalPages | Int      | 总页数           |
| pageNum    | int      | 当前页数         |
| courses    | Object   | 所有阅读课程对象 |
| pageName   | string   | 页面名称         |

#### 返回包含内容，示例返回演示

```java
pageNum:1

totalPages:1

courses:{readingCourses=[ReadingCourse [courseId=2, languageType=LanguageType [languageTypeId=5, languageName=中文, languageIconUrl=/SSLearningTeam/Languages/987a7e8a-7815-4b46-82ab-c870eeaf7510_language.png], rateType=RateType [rateTypeId=2, languageType=null, rateName=二级, rateIconUrl=/SSLearningTeam/Ratetypes/28b165d6-7441-4af4-beb0-916939e90614_ratetype.png], courseName=测试阅读1s, courseChineseContent=测试s, courseEnglishContent=tests, downloadNum=2, instructionImgUrl=/SSLearningTeam/ReadingCourseResource/43edaca2-f178-4b6e-baee-d82adaa5d2d11.png]], oralCourses=[], listeningCourses=[]}
    
pageName:"courseManage"
```

### 33.管理员获取阅读课程列表页面（按照下载量排序顺序）

#### 请求地址

> URL：/course/admin/readingCourses_manageByDownload/{pageNum} 
>
> pageNum表示页号

#### 请求参数

无

#### 返回携带内容

| 字段       | 字段类型 | 字段说明             |
| ---------- | -------- | -------------------- |
| totalPages | Int      | 总页数               |
| pageNum    | int      | 当前页数             |
| courses    | Object   | 筛选后的阅读课程对象 |
| pageName   | string   | 页面名称             |

#### 返回包含内容，示例返回演示

```java
pageNum:1

totalPages:1

courses:{readingCourses=[ReadingCourse [courseId=2, languageType=LanguageType [languageTypeId=5, languageName=中文, languageIconUrl=/SSLearningTeam/Languages/987a7e8a-7815-4b46-82ab-c870eeaf7510_language.png], rateType=RateType [rateTypeId=2, languageType=null, rateName=二级, rateIconUrl=/SSLearningTeam/Ratetypes/28b165d6-7441-4af4-beb0-916939e90614_ratetype.png], courseName=测试阅读1s, courseChineseContent=测试s, courseEnglishContent=tests, downloadNum=2, instructionImgUrl=/SSLearningTeam/ReadingCourseResource/43edaca2-f178-4b6e-baee-d82adaa5d2d11.png]], oralCourses=[], listeningCourses=[]}

pageName:"courseManage"
```

### 34.管理员获取筛选指定语言类别的阅读课程列表 

#### 请求地址

> URL：/course/admin/readingCourses_manageByLanguageType/{pageNum} 
>
> pageNum表示页号

#### 请求参数

| 字段           | 字段类型 | 字段说明   |
| -------------- | -------- | ---------- |
| languageTypeId | int      | 语言类别Id |

#### 返回携带内容

| 字段       | 字段类型 | 字段说明             |
| ---------- | -------- | -------------------- |
| totalPages | Int      | 总页数               |
| pageNum    | int      | 当前页数             |
| courses    | Object   | 筛选后的阅读课程对象 |
| pageName   | string   | 页面名称             |

#### 返回包含内容，示例返回演示

```java
pageNum:1

totalPages:1

courses:{readingCourses=[ReadingCourse [courseId=2, languageType=LanguageType [languageTypeId=5, languageName=中文, languageIconUrl=/SSLearningTeam/Languages/987a7e8a-7815-4b46-82ab-c870eeaf7510_language.png], rateType=RateType [rateTypeId=2, languageType=null, rateName=二级, rateIconUrl=/SSLearningTeam/Ratetypes/28b165d6-7441-4af4-beb0-916939e90614_ratetype.png], courseName=测试阅读1s, courseChineseContent=测试s, courseEnglishContent=tests, downloadNum=2, instructionImgUrl=/SSLearningTeam/ReadingCourseResource/43edaca2-f178-4b6e-baee-d82adaa5d2d11.png]], oralCourses=[], listeningCourses=[]}
  
pageName:"courseManage"
```

### 35.管理员获取筛选指定种类类别(种类类别已经确定了语言类别)的阅读课程列表

#### 请求地址

> URL：/course/admin/readingCourses_manageByRateType/{pageNum} 
>
> pageNum表示页号

#### 请求参数

| 字段       | 字段类型 | 字段说明   |
| ---------- | -------- | ---------- |
| rateTypeId | int      | 种类类别Id |

#### 返回携带内容

| 字段       | 字段类型 | 字段说明             |
| ---------- | -------- | -------------------- |
| totalPages | Int      | 总页数               |
| pageNum    | int      | 当前页数             |
| courses    | Object   | 筛选后的阅读课程对象 |
| pageName   | string   | 页面名称             |

#### 返回包含内容，示例返回演示

```java
pageNum:1

totalPages:1

courses:{readingCourses=[ReadingCourse [courseId=2, languageType=LanguageType [languageTypeId=5, languageName=中文, languageIconUrl=/SSLearningTeam/Languages/987a7e8a-7815-4b46-82ab-c870eeaf7510_language.png], rateType=RateType [rateTypeId=2, languageType=null, rateName=二级, rateIconUrl=/SSLearningTeam/Ratetypes/28b165d6-7441-4af4-beb0-916939e90614_ratetype.png], courseName=测试阅读1s, courseChineseContent=测试s, courseEnglishContent=tests, downloadNum=2, instructionImgUrl=/SSLearningTeam/ReadingCourseResource/43edaca2-f178-4b6e-baee-d82adaa5d2d11.png]], oralCourses=[], listeningCourses=[]}

pageName:"courseManage"
```

<hr/>

## 轮播图相关接口

### 1.获取轮播图上传页面

#### 1.1 请求说明

> 请求方式：GET
> 请求URL ：/website/admin/toAddCarouselMap 

#### 1.2 请求参数

无

#### 1.3 返回数据

- 样例

```java
pageName："recommendManage"
```

- 数据说明

| 字段     | 类型   | 含义     |
| -------- | ------ | -------- |
| pageName | string | 页面名称 |

#### 1.4 返回页面

> admin/websiteManager/addCarouselMap.jsp

### 2.轮播图上传接口

#### 2.1 请求说明

> 请求方式：POST
> 请求URL ：/website/admin/addCarouselMap 

#### 2.2 请求参数

| 字段                | 类型   | 含义           |
| ------------------- | ------ | -------------- |
| carouselInstruction | string | 轮播图简介     |
| carouselImg         | file   | 轮播图图片     |
| carouselLinkUrl     | string | 轮播图链接地址 |

#### 2.3 返回数据

- 样例

无

- 数据说明

无

#### 2.4 返回页面

> 重定向到：admin/websiteManager/carouselMap_manage.jsp

### 3.轮播图删除接口JSON 

#### 3.1 请求说明

> 请求方式：GET
> 请求URL ：/language/admin/deleteCarouselMap 

#### 3.2 请求参数

| 字段       | 类型 | 含义     |
| ---------- | ---- | -------- |
| carouselId | int  | 轮播图Id |

#### 3.3 返回结果接收

- 成功时返回内容

```json  
{
    "status": true,
    "info": "删除成功"
}
```

- 失败时返回内容

```json
{
    "status": false,
    "info": "删除失败"
}
```

#### 3.4 返回参数

过于简单，不作讲解

### 4.获取轮播图修改页面

#### 4.1 请求说明

> 请求方式：GET
> 请求URL ：/website/admin/toUpdateCarouselMap 

#### 4.2 请求参数

| 字段       | 类型 | 含义     |
| ---------- | ---- | -------- |
| carouselId | int  | 轮播图Id |

#### 4.3 返回数据

- 样例

```java
pageName："recommendManage"
    
carouselMap:CarouselMap [carouselId=0, carouselInstruction=轮播图2, carouselImgUrl=/SSLearningTeam/CarouselMaps/5a74771d-4de9-4342-9f58-6e47fd8dd8ee_carouselMap.png, carouselLinkUrl=www.souhu.com]
```

- 数据说明

| 字段        | 类型        | 含义       |
| ----------- | ----------- | ---------- |
| pageName    | string      | 页面名称   |
| carouselMap | CarouselMap | 轮播图对象 |

#### 4.4 返回页面

> admin/websiteManager/updateCarouselMap

### 5.轮播图修改接口

#### 5.1 请求说明

> 请求方式：POST
> 请求URL ：/website/admin/updateCarouselMap 

#### 5.2 请求参数

| 字段                | 类型   | 含义           |
| ------------------- | ------ | -------------- |
| carouselInstruction | string | 轮播图简介     |
| carouselImg         | file   | 轮播图图片     |
| carouselLinkUrl     | string | 轮播图链接地址 |
| carouselId          | int    | 轮播图Id       |

#### 5.3 返回数据

- 样例

无

- 数据说明

无

#### 5.4 返回页面

> 重定向到：admin/websiteManager/carouselMap_manage.jsp

### 6.查看轮播图列表(分页) 

#### 6.1 请求说明

> 请求方式：GET
> 请求URL ：/website/admin/carouselMap_manage/{pageNum} 
>
> pageNum表示页号

#### 6.2 请求参数

无

#### 6.3 返回数据

- 样例

```java
pageName："recommendManage"
    
carouselMaps:[CarouselMap [carouselId=0, carouselInstruction=轮播图1, carouselImgUrl=/SSLearningTeam/CarouselMaps/5bdf3f5c-1786-4b13-9423-5c4b944e5212_carouselMap.png, carouselLinkUrl=www.baidu.com], CarouselMap [carouselId=0, carouselInstruction=轮播图2, carouselImgUrl=/SSLearningTeam/CarouselMaps/5a74771d-4de9-4342-9f58-6e47fd8dd8ee_carouselMap.png, carouselLinkUrl=www.souhu.com]]

pageNumber:1

currentPage:1
```

- 数据说明

| 字段        | 类型              | 含义           |
| ----------- | ----------------- | -------------- |
| pageName    | string            | 页面名称       |
| carouselMap | List<CarouselMap> | 轮播图对象集合 |
| pageNumber  | Integer           | 总页数         |
| currentPage | Integer           | 当前页号       |

#### 6.4 返回页面

> admin/websiteManager/carouselMap_manage 

### 7.查看所有轮播图列表(不分页) 

#### 7.1 请求说明

> 请求方式：GET
> 请求URL ：/website/admin/carouselMap_manage

#### 7.2 请求参数

无

#### 7.3 返回数据

- 样例

```java
pageName："recommendManage"
    
carouselMaps:[CarouselMap [carouselId=0, carouselInstruction=轮播图1, carouselImgUrl=/SSLearningTeam/CarouselMaps/5bdf3f5c-1786-4b13-9423-5c4b944e5212_carouselMap.png, carouselLinkUrl=www.baidu.com], CarouselMap [carouselId=0, carouselInstruction=轮播图2, carouselImgUrl=/SSLearningTeam/CarouselMaps/5a74771d-4de9-4342-9f58-6e47fd8dd8ee_carouselMap.png, carouselLinkUrl=www.souhu.com]]

pageNumber:1

currentPage1
```

- 数据说明

| 字段        | 类型              | 含义           |
| ----------- | ----------------- | -------------- |
| pageName    | string            | 页面名称       |
| carouselMap | List<CarouselMap> | 轮播图对象集合 |
| pageNumber  | Integer           | 总页数         |
| currentPage | Integer           | 当前页号       |

#### 7.4 返回页面

> admin/websiteManager/carouselMap_manage 

<hr/>

## 下载管理相关接口

### 1.查看下载记录（分页）

#### 1.1 请求说明

> 请求方式：GET
> 请求URL ：/website/admin/getDownloadRecordings/{pageNum} 
>
> pageNum表示页号

#### 1.2 请求参数

无

#### 1.3 返回数据

- 样例

```java
pageName："downloadRecordingManage"
    
downloadRecordings:[DownloadRecording [downloadRecordingId=1, user=User [userId=2, userSex=男, userName=Daming, userPassword=8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92, userAvatarUrl=/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/fcfb6747-5ef4-47fe-8e7e-ff1b4b6e05c615842685420Avatar.png, userPhoneNumber=15842685420, userPermission=0], courseType=listeningcourse, course=null, downloadRecordingTime=Mon Aug 27 19:20:56 CST 2018], DownloadRecording [downloadRecordingId=2, user=User [userId=2, userSex=男, userName=Daming, userPassword=8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92, userAvatarUrl=/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/fcfb6747-5ef4-47fe-8e7e-ff1b4b6e05c615842685420Avatar.png, userPhoneNumber=15842685420, userPermission=0], courseType=listeningcourse, course=null, downloadRecordingTime=Mon Aug 27 19:24:29 CST 2018], DownloadRecording [downloadRecordingId=3, user=User [userId=3, userSex=女, userName=Amy, userPassword=8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92, userAvatarUrl=/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/616b55f8-8df9-49ac-9247-a1bd1780391918041168030Avatar.png, userPhoneNumber=18041168030, userPermission=0], courseType=listeningcourse, course=Course [courseId=3, languageType=null, rateType=null, courseName=测试听力2, courseEnglishContent=English, courseResourceUrl=/SSLearningTeam/ListeningCourseResource/e1f53648-64a0-4b7b-af59-4cee36b8149f学员网页端.mp3, downloadNum=2, instructionImgUrl=/SSLearningTeam/ListeningCourseResource/bed0730d-5012-4e17-8923-a2f952c63bcb英文.png], downloadRecordingTime=Mon Aug 27 19:25:23 CST 2018]]

pageNumber:1

currentPage:1
```

- 数据说明

| 字段               | 类型                     | 含义         |
| ------------------ | ------------------------ | ------------ |
| pageName           | string                   | 页面名称     |
| downloadRecordings | List< DownloadRecording> | 下载对象集合 |
| pageNumber         | Integer                  | 总页数       |
| currentPage        | Integer                  | 当前页号     |

#### 1.4 返回页面

> admin/websiteManager/downloadRecording_manage 

### 2.删除指定下载的记录JSON 

#### 2.1 请求说明

> 请求方式：GET
> 请求URL ：/website/admin/deleteDownloadRecording 

#### 2.2 请求参数

| 字段                | 类型 | 含义       |
| ------------------- | ---- | ---------- |
| downloadRecordingId | int  | 下载记录Id |

#### 2.3 返回结果接收

- 成功时返回内容

```json  
{
    "status": true,
    "info": "删除成功"
}
```

- 失败时返回内容

```json
{
    "status": false,
    "info": "删除失败"
}
```

#### 2.4 返回参数

过于简单，不作讲解

<hr/>

## 课程问题Question操作接口

### 1.给指定课程添加问题 

#### 1.1 请求说明

> 请求方式：POST
> 请求URL ：/course/admin/addQuestion 

#### 1.2 请求参数

| 字段            | 类型   | 含义     |
| --------------- | ------ | -------- |
| courseType      | string | 课程类型 |
| courseId        | int    | 课程Id   |
| questionContent | string | 问题内容 |
| answerA         | string | A内容    |
| answerB         | string | B内容    |
| answerC         | string | C内容    |
| answerD         | string | D内容    |
| answerReal      | int    | 真实答案 |
| answerReason    | string | 答案详解 |

#### 1.3 返回结果接收

- 成功时返回内容

```json  
{
    "status": true,
    "info": "添加成功"
}
```

- 失败时返回内容

```json
{
    "status": false,
    "info": "添加失败"
}
```

#### 1.4 返回参数

过于简单，不作讲解

### 2.给指定课程删除问题 

#### 2.1 请求说明

> 请求方式：GET
> 请求URL ：/course/admin/deleteQuestion 

#### 2.2 请求参数

| 字段       | 类型 | 含义   |
| ---------- | ---- | ------ |
| questionId | int  | 问题Id |

#### 2.3 返回结果接收

- 成功时返回内容

```json  
{
    "status": true,
    "info": "删除成功"
}
```

- 失败时返回内容

```json
{
    "status": false,
    "info": "删除失败"
}
```

#### 2.4 返回参数

过于简单，不作讲解

### 3.修改指定课程的表单回显 

#### 3.1 请求说明

> 请求方式：GET
> 请求URL ：/course/admin/toChangeQuestion 

#### 3.2 请求参数

| 字段       | 类型 | 含义   |
| ---------- | ---- | ------ |
| questionId | int  | 问题Id |

#### 3.3 返回结果接收

- 成功时返回内容

```json  
{
    "status": true,
    "info": {
        "questionId": 1,
        "courseType": "listeningcourse",
        "courseId": 2,
        "questionContent": "这是中文课程的问题题目5",
        "answerA": "答案选项A5",
        "answerB": "答案选项B5",
        "answerC": "答案选项C5",
        "answerD": "答案选项D5",
        "answerReal": 4,
        "answerReason": "我觉得选D"
    }
}
```

- 失败时返回内容

```json
{
    "status": false,
    "info": "查询失败"
}
```

#### 3.4 返回参数

过于简单，不作讲解

### 4.修改指定课程的问题 

#### 4.1 请求说明

> 请求方式：GET
> 请求URL ：/course/admin/changeQuestion 

#### 4.2 请求参数

| questionId      | int    | 问题Id   |
| --------------- | ------ | -------- |
| courseType      | string | 课程类型 |
| courseId        | int    | 课程Id   |
| questionContent | string | 问题内容 |
| answerA         | string | A内容    |
| answerB         | string | B内容    |
| answerC         | string | C内容    |
| answerD         | string | D内容    |
| answerReal      | int    | 真实答案 |
| answerReason    | string | 答案详解 |

#### 4.3 返回结果接收

- 成功时返回内容

```json  
{
    "status": true,
    "info": "修改成功"
}
```

- 失败时返回内容

```json
{
    "status": false,
    "info": "修改失败"
}
```

#### 4.4 返回参数

过于简单，不作讲解

### 5.查看指定课程的所有问题 

#### 5.1 请求说明

> 请求方式：GET
> 请求URL ：/course/admin/getAllQuestion  

#### 5.2 请求参数

| 字段       | 类型   | 含义     |
| ---------- | ------ | -------- |
| courseType | string | 课程类型 |
| courseId   | int    | 课程Id   |

#### 5.3 返回结果接收

- 成功时返回内容

```json  
{
    "status": true,
    "info": [
        {
            "questionId": 2,
            "courseType": "listeningcourse",
            "courseId": 2,
            "questionContent": "这是中文课程的问题题目",
            "answerA": "答案选项A",
            "answerB": "答案选项B",
            "answerC": "答案选项C",
            "answerD": "答案选项D",
            "answerReal": 1,
            "answerReason": "我觉得选A"
        },
        {
            "questionId": 3,
            "courseType": "listeningcourse",
            "courseId": 2,
            "questionContent": "这是中文课程的问题题目",
            "answerA": "答案选项A",
            "answerB": "答案选项B",
            "answerC": "答案选项C",
            "answerD": "答案选项D",
            "answerReal": 1,
            "answerReason": "我觉得选A"
        },
        {
            "questionId": 4,
            "courseType": "listeningcourse",
            "courseId": 2,
            "questionContent": "这是中文课程的问题题目2",
            "answerA": "答案选项A2",
            "answerB": "答案选项B2",
            "answerC": "答案选项C2",
            "answerD": "答案选项D2",
            "answerReal": 2,
            "answerReason": "我觉得选B"
        },
        {
            "questionId": 5,
            "courseType": "listeningcourse",
            "courseId": 2,
            "questionContent": "这是中文课程的问题题目3",
            "answerA": "答案选项A3",
            "answerB": "答案选项B3",
            "answerC": "答案选项C3",
            "answerD": "答案选项D3",
            "answerReal": 3,
            "answerReason": "我觉得选C"
        },
        {
            "questionId": 6,
            "courseType": "listeningcourse",
            "courseId": 2,
            "questionContent": "这是中文课程的问题题目4",
            "answerA": "答案选项A4",
            "answerB": "答案选项B4",
            "answerC": "答案选项C4",
            "answerD": "答案选项D4",
            "answerReal": 4,
            "answerReason": "我觉得选D"
        }
    ]
}
```

- 失败时返回内容

```json
{
    "status": false,
    "info": "查询失败"
}
```

#### 5.4 返回参数

过于简单，不作讲解

<hr/>

## 意见反馈相关接口

### 1.删除意见反馈

#### 1.1 请求说明

> 请求方式：GET
> 请求URL ：/advice/admin/deleteAdvice 

#### 1.2 请求参数

| 字段     | 类型 | 含义   |
| -------- | ---- | ------ |
| adviceId | int  | 建议Id |

#### 1.3 返回结果接收

- 成功时返回内容

```json  
{
    "status": true,
    "info": "删除成功"
}
```

- 失败时返回内容

```json
{
    "status": false,
    "info": "删除失败"
}
```

#### 1.4 返回参数

过于简单，不作讲解

### 2.查看所有意见(分页) 

#### 2.1 请求说明

> 请求方式：GET
> 请求URL ：/advice/admin/advices_manage/{pageNum} 
>
> pageNum表示页号

#### 2.2 请求参数

无

#### 2.3 返回数据

- 样例

```java
pageNum:1

totalPages:2

adviceInfoLists:[AdviceInfoList [adviceId=1, user=User [userId=3, userSex=女, userName=Amy, userPassword=8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92, userAvatarUrl=/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/616b55f8-8df9-49ac-9247-a1bd1780391918041168030Avatar.png, userPhoneNumber=18041168030, userPermission=0], adviceSendTime=Sat Sep 01 01:34:01 CST 2018, adviceInfo=提交建议1], AdviceInfoList [adviceId=2, user=User [userId=3, userSex=女, userName=Amy, userPassword=8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92, userAvatarUrl=/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/616b55f8-8df9-49ac-9247-a1bd1780391918041168030Avatar.png, userPhoneNumber=18041168030, userPermission=0], adviceSendTime=Sat Sep 01 01:34:23 CST 2018, adviceInfo=提交建议2], AdviceInfoList [adviceId=3, user=User [userId=3, userSex=女, userName=Amy, userPassword=8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92, userAvatarUrl=/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/616b55f8-8df9-49ac-9247-a1bd1780391918041168030Avatar.png, userPhoneNumber=18041168030, userPermission=0], adviceSendTime=Sat Sep 01 01:34:26 CST 2018, adviceInfo=提交建议3], AdviceInfoList [adviceId=4, user=User [userId=3, userSex=女, userName=Amy, userPassword=8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92, userAvatarUrl=/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/616b55f8-8df9-49ac-9247-a1bd1780391918041168030Avatar.png, userPhoneNumber=18041168030, userPermission=0], adviceSendTime=Sat Sep 01 01:34:30 CST 2018, adviceInfo=提交建议4], AdviceInfoList [adviceId=5, user=User [userId=3, userSex=女, userName=Amy, userPassword=8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92, userAvatarUrl=/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/616b55f8-8df9-49ac-9247-a1bd1780391918041168030Avatar.png, userPhoneNumber=18041168030, userPermission=0], adviceSendTime=Sat Sep 01 01:34:33 CST 2018, adviceInfo=提交建议5], AdviceInfoList [adviceId=6, user=User [userId=3, userSex=女, userName=Amy, userPassword=8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92, userAvatarUrl=/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/616b55f8-8df9-49ac-9247-a1bd1780391918041168030Avatar.png, userPhoneNumber=18041168030, userPermission=0], adviceSendTime=Sat Sep 01 01:34:36 CST 2018, adviceInfo=提交建议6], AdviceInfoList [adviceId=7, user=User [userId=3, userSex=女, userName=Amy, userPassword=8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92, userAvatarUrl=/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/616b55f8-8df9-49ac-9247-a1bd1780391918041168030Avatar.png, userPhoneNumber=18041168030, userPermission=0], adviceSendTime=Sat Sep 01 01:34:40 CST 2018, adviceInfo=提交建议7], AdviceInfoList [adviceId=8, user=User [userId=4, userSex=男, userName=Sam, userPassword=8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92, userAvatarUrl=/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/c6cbcce3-790f-4fdb-962a-4df4470ef58818041168031Avatar.png, userPhoneNumber=18041168031, userPermission=0], adviceSendTime=Sat Sep 01 01:34:50 CST 2018, adviceInfo=提交建议8], AdviceInfoList [adviceId=9, user=User [userId=4, userSex=男, userName=Sam, userPassword=8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92, userAvatarUrl=/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/c6cbcce3-790f-4fdb-962a-4df4470ef58818041168031Avatar.png, userPhoneNumber=18041168031, userPermission=0], adviceSendTime=Sat Sep 01 01:34:54 CST 2018, adviceInfo=提交建议9], AdviceInfoList [adviceId=10, user=User [userId=4, userSex=男, userName=Sam, userPassword=8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92, userAvatarUrl=/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/c6cbcce3-790f-4fdb-962a-4df4470ef58818041168031Avatar.png, userPhoneNumber=18041168031, userPermission=0], adviceSendTime=Sat Sep 01 01:34:57 CST 2018, adviceInfo=提交建议10]]

pageName="adminManage"
```

- 数据说明

| 字段            | 类型                    | 含义         |
| --------------- | ----------------------- | ------------ |
| pageName        | string                  | 页面名称     |
| adviceInfoLists | List<  AdviceInfoList > | 意见反馈集合 |
| pageNumber      | Integer                 | 总页数       |
| currentPage     | Integer                 | 当前页号     |

#### 2.4 返回页面

> admin/websiteManager/advices_manage 

### 3.根据用户查看意见(分页) 

#### 3.1 请求说明

> 请求方式：GET
> 请求URL ：/advice/admin/advices_manageByUserId/{pageNum} 
>
> pageNum表示页号

#### 3.2 请求参数

| 字段   | 类型 | 含义   |
| ------ | ---- | ------ |
| userId | int  | 用户Id |

#### 3.3 返回数据

- 样例

```java
pageNum:1

totalPages:1

adviceInfoLists:[AdviceInfoList [adviceId=1, user=User [userId=3, userSex=女, userName=Amy, userPassword=8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92, userAvatarUrl=/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/616b55f8-8df9-49ac-9247-a1bd1780391918041168030Avatar.png, userPhoneNumber=18041168030, userPermission=0], adviceSendTime=Sat Sep 01 01:34:01 CST 2018, adviceInfo=提交建议1], AdviceInfoList [adviceId=2, user=User [userId=3, userSex=女, userName=Amy, userPassword=8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92, userAvatarUrl=/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/616b55f8-8df9-49ac-9247-a1bd1780391918041168030Avatar.png, userPhoneNumber=18041168030, userPermission=0], adviceSendTime=Sat Sep 01 01:34:23 CST 2018, adviceInfo=提交建议2], AdviceInfoList [adviceId=3, user=User [userId=3, userSex=女, userName=Amy, userPassword=8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92, userAvatarUrl=/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/616b55f8-8df9-49ac-9247-a1bd1780391918041168030Avatar.png, userPhoneNumber=18041168030, userPermission=0], adviceSendTime=Sat Sep 01 01:34:26 CST 2018, adviceInfo=提交建议3], AdviceInfoList [adviceId=4, user=User [userId=3, userSex=女, userName=Amy, userPassword=8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92, userAvatarUrl=/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/616b55f8-8df9-49ac-9247-a1bd1780391918041168030Avatar.png, userPhoneNumber=18041168030, userPermission=0], adviceSendTime=Sat Sep 01 01:34:30 CST 2018, adviceInfo=提交建议4], AdviceInfoList [adviceId=5, user=User [userId=3, userSex=女, userName=Amy, userPassword=8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92, userAvatarUrl=/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/616b55f8-8df9-49ac-9247-a1bd1780391918041168030Avatar.png, userPhoneNumber=18041168030, userPermission=0], adviceSendTime=Sat Sep 01 01:34:33 CST 2018, adviceInfo=提交建议5], AdviceInfoList [adviceId=6, user=User [userId=3, userSex=女, userName=Amy, userPassword=8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92, userAvatarUrl=/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/616b55f8-8df9-49ac-9247-a1bd1780391918041168030Avatar.png, userPhoneNumber=18041168030, userPermission=0], adviceSendTime=Sat Sep 01 01:34:36 CST 2018, adviceInfo=提交建议6], AdviceInfoList [adviceId=7, user=User [userId=3, userSex=女, userName=Amy, userPassword=8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92, userAvatarUrl=/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/616b55f8-8df9-49ac-9247-a1bd1780391918041168030Avatar.png, userPhoneNumber=18041168030, userPermission=0], adviceSendTime=Sat Sep 01 01:34:40 CST 2018, adviceInfo=提交建议7]]

pageName="adminManage"
```

- 数据说明

| 字段            | 类型                    | 含义         |
| --------------- | ----------------------- | ------------ |
| pageName        | string                  | 页面名称     |
| adviceInfoLists | List<  AdviceInfoList > | 意见反馈集合 |
| pageNumber      | Integer                 | 总页数       |
| currentPage     | Integer                 | 当前页号     |

#### 3.4 返回页面

> admin/websiteManager/advices_manage 

<hr/>

## 课程评分操作接口

### 1.删除评分记录 

#### 1.1 请求说明

> 请求方式：GET
> 请求URL ：/course/admin/deleteEvaluation 

#### 1.2 请求参数

| 字段         | 类型 | 含义       |
| ------------ | ---- | ---------- |
| evaluationId | int  | 评分记录Id |

#### 1.3 返回结果接收

- 成功时返回内容

```json  
{
    "status": true,
    "info": "删除成功"
}
```

- 失败时返回内容

```json
{
    "status": false,
    "info": "删除失败"
}
```

#### 1.4 返回参数

过于简单，不作讲解

### 2.查看课程的综合评分 

#### 2.1 请求说明

> 请求方式：GET
> 请求URL ：/course/admin/getAvgEvaluation 

#### 2.2 请求参数

| 字段       | 类型   | 含义     |
| ---------- | ------ | -------- |
| courseType | string | 课程类型 |
| courseId   | int    | 课程Id   |

#### 2.3 返回结果接收

- 成功时返回内容

```json  
{
    "status": true,
    "info": 3
}
```

- 失败时返回内容

```json
{
    "status": false,
    "info": "暂无人对该课程进行评价"
}
```

#### 2.4 返回参数

| 字段 | 类型       | 含义                                             |
| ---- | ---------- | ------------------------------------------------ |
| info | int/string | 当有人评价时为评价的平均分，无人评价时为提示内容 |

### 3.查看指定课程的评分列表(分页)  

#### 3.1 请求说明

> 请求方式：GET
> 请求URL ：/course/admin/getAllEvaluationOfCourse/{pageNum} 
>
> pageNum是页号

#### 3.2 请求参数

| 字段       | 类型   | 含义     |
| ---------- | ------ | -------- |
| courseType | string | 课程类型 |
| courseId   | int    | 课程Id   |

#### 3.3 返回结果接收

- 成功时返回内容

```json  
{
    "status": true,
    "info": {
        "evaluationForms": [
            {
                "evaluationId": 1,
                "course": {
                    "courseId": 2,
                    "languageType": null,
                    "rateType": null,
                    "courseName": "测试听力",
                    "courseEnglishContent": "Chinese",
                    "courseResourceUrl": "/SSLearningTeam/ListeningCourseResource/38693414-c968-4c78-8b84-3c219dc8d79a学员网页端.mp3",
                    "downloadNum": 4,
                    "instructionImgUrl": "/SSLearningTeam/ListeningCourseResource/22e3b1a2-0075-494b-850b-67cd18ac57c7中文.png"
                },
                "user": {
                    "userId": 3,
                    "userSex": "女",
                    "userName": "Amy",
                    "userPassword": "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92",
                    "userAvatarUrl": "/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/616b55f8-8df9-49ac-9247-a1bd1780391918041168030Avatar.png",
                    "userPhoneNumber": "18041168030",
                    "userPermission": 0
                },
                "evaluationLevel": 2
            },
            {
                "evaluationId": 2,
                "course": {
                    "courseId": 2,
                    "languageType": null,
                    "rateType": null,
                    "courseName": "测试听力",
                    "courseEnglishContent": "Chinese",
                    "courseResourceUrl": "/SSLearningTeam/ListeningCourseResource/38693414-c968-4c78-8b84-3c219dc8d79a学员网页端.mp3",
                    "downloadNum": 4,
                    "instructionImgUrl": "/SSLearningTeam/ListeningCourseResource/22e3b1a2-0075-494b-850b-67cd18ac57c7中文.png"
                },
                "user": {
                    "userId": 3,
                    "userSex": "女",
                    "userName": "Amy",
                    "userPassword": "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92",
                    "userAvatarUrl": "/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/616b55f8-8df9-49ac-9247-a1bd1780391918041168030Avatar.png",
                    "userPhoneNumber": "18041168030",
                    "userPermission": 0
                },
                "evaluationLevel": 2
            },
            {
                "evaluationId": 3,
                "course": {
                    "courseId": 2,
                    "languageType": null,
                    "rateType": null,
                    "courseName": "测试听力",
                    "courseEnglishContent": "Chinese",
                    "courseResourceUrl": "/SSLearningTeam/ListeningCourseResource/38693414-c968-4c78-8b84-3c219dc8d79a学员网页端.mp3",
                    "downloadNum": 4,
                    "instructionImgUrl": "/SSLearningTeam/ListeningCourseResource/22e3b1a2-0075-494b-850b-67cd18ac57c7中文.png"
                },
                "user": {
                    "userId": 3,
                    "userSex": "女",
                    "userName": "Amy",
                    "userPassword": "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92",
                    "userAvatarUrl": "/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/616b55f8-8df9-49ac-9247-a1bd1780391918041168030Avatar.png",
                    "userPhoneNumber": "18041168030",
                    "userPermission": 0
                },
                "evaluationLevel": 2
            },
            {
                "evaluationId": 4,
                "course": {
                    "courseId": 2,
                    "languageType": null,
                    "rateType": null,
                    "courseName": "测试听力",
                    "courseEnglishContent": "Chinese",
                    "courseResourceUrl": "/SSLearningTeam/ListeningCourseResource/38693414-c968-4c78-8b84-3c219dc8d79a学员网页端.mp3",
                    "downloadNum": 4,
                    "instructionImgUrl": "/SSLearningTeam/ListeningCourseResource/22e3b1a2-0075-494b-850b-67cd18ac57c7中文.png"
                },
                "user": {
                    "userId": 3,
                    "userSex": "女",
                    "userName": "Amy",
                    "userPassword": "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92",
                    "userAvatarUrl": "/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/616b55f8-8df9-49ac-9247-a1bd1780391918041168030Avatar.png",
                    "userPhoneNumber": "18041168030",
                    "userPermission": 0
                },
                "evaluationLevel": 4
            },
            {
                "evaluationId": 5,
                "course": {
                    "courseId": 2,
                    "languageType": null,
                    "rateType": null,
                    "courseName": "测试听力",
                    "courseEnglishContent": "Chinese",
                    "courseResourceUrl": "/SSLearningTeam/ListeningCourseResource/38693414-c968-4c78-8b84-3c219dc8d79a学员网页端.mp3",
                    "downloadNum": 4,
                    "instructionImgUrl": "/SSLearningTeam/ListeningCourseResource/22e3b1a2-0075-494b-850b-67cd18ac57c7中文.png"
                },
                "user": {
                    "userId": 4,
                    "userSex": "男",
                    "userName": "Sam",
                    "userPassword": "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92",
                    "userAvatarUrl": "/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/c6cbcce3-790f-4fdb-962a-4df4470ef58818041168031Avatar.png",
                    "userPhoneNumber": "18041168031",
                    "userPermission": 0
                },
                "evaluationLevel": 4
            },
            {
                "evaluationId": 6,
                "course": {
                    "courseId": 2,
                    "languageType": null,
                    "rateType": null,
                    "courseName": "测试听力",
                    "courseEnglishContent": "Chinese",
                    "courseResourceUrl": "/SSLearningTeam/ListeningCourseResource/38693414-c968-4c78-8b84-3c219dc8d79a学员网页端.mp3",
                    "downloadNum": 4,
                    "instructionImgUrl": "/SSLearningTeam/ListeningCourseResource/22e3b1a2-0075-494b-850b-67cd18ac57c7中文.png"
                },
                "user": {
                    "userId": 5,
                    "userSex": "男",
                    "userName": "辛俊桥",
                    "userPassword": "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92",
                    "userAvatarUrl": "/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/8d1c8fca-7af1-4457-bfe7-2ad92e6901ef18041168032Avatar.png",
                    "userPhoneNumber": "18041168032",
                    "userPermission": 0
                },
                "evaluationLevel": 4
            }
        ],
        "pageNumber": 1,
        "currentPage": 1
    }
}
```

- 失败时返回内容

```json
{
    "status": false,
    "info": "暂无人对该课程进行评价"
}
```

#### 3.4 返回参数

| 字段            | 类型                     | 含义     |
| --------------- | ------------------------ | -------- |
| evaluationForms | List<   EvaluationForm > | 评分集合 |
| pageNumber      | Integer                  | 总页数   |
| currentPage     | Integer                  | 当前页号 |

<hr/>

## 历史记录操作接口

### 1.删除浏览历史 

#### 1.1 请求说明

> 请求方式：GET
> 请求URL ：/course/admin/deleteHistoryRecording

#### 1.2 请求参数

| 字段               | 类型 | 含义       |
| ------------------ | ---- | ---------- |
| historyRecordingId | int  | 历史记录Id |

#### 1.3 返回结果接收

- 成功时返回内容

```json  
{
    "status": true,
    "info": "删除成功"
}
```

- 失败时返回内容

```json
{
    "status": false,
    "info": "删除失败"
}
```

#### 1.4 返回参数

过于简单，不作讲解

### 2.查看指定用户的浏览历史（分页） 

#### 2.1 请求说明

> 请求方式：GET
> 请求URL ：/course/admin/getHistoryRecordingOfUser/{pageNum} 
>
> pageNum为页号

#### 2.2 请求参数

| 字段   | 类型 | 含义                               |
| ------ | ---- | ---------------------------------- |
| userId | int  | 用户Id(如果可以传cookie则可以不传) |

#### 2.3 返回结果接收

- 成功时返回内容

```json  
{
    "status": true,
    "info": {
        "pageNumber": 1,
        "historyRecordings": [
            {
                "historyRecordingId": 3,
                "user": {
                    "userId": 3,
                    "userSex": "女",
                    "userName": "Amy",
                    "userPassword": "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92",
                    "userAvatarUrl": "/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/616b55f8-8df9-49ac-9247-a1bd1780391918041168030Avatar.png",
                    "userPhoneNumber": "18041168030",
                    "userPermission": 0
                },
                "course": {
                    "courseId": 2,
                    "languageType": {
                        "languageTypeId": 5,
                        "languageName": "中文",
                        "languageIconUrl": "/SSLearningTeam/Languages/987a7e8a-7815-4b46-82ab-c870eeaf7510_language.png"
                    },
                    "rateType": {
                        "rateTypeId": 2,
                        "languageType": null,
                        "rateName": "二级",
                        "rateIconUrl": "/SSLearningTeam/Ratetypes/28b165d6-7441-4af4-beb0-916939e90614_ratetype.png"
                    },
                    "courseName": "测试听力",
                    "courseChineseContent": "中文",
                    "courseEnglishContent": "Chinese",
                    "courseResourceUrl": "/SSLearningTeam/ListeningCourseResource/38693414-c968-4c78-8b84-3c219dc8d79a学员网页端.mp3",
                    "downloadNum": 4,
                    "instructionImgUrl": "/SSLearningTeam/ListeningCourseResource/22e3b1a2-0075-494b-850b-67cd18ac57c7中文.png"
                },
                "recentRecordingTime": 1535766654000,
                "viewTimes": 1
            },
            {
                "historyRecordingId": 4,
                "user": {
                    "userId": 3,
                    "userSex": "女",
                    "userName": "Amy",
                    "userPassword": "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92",
                    "userAvatarUrl": "/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/616b55f8-8df9-49ac-9247-a1bd1780391918041168030Avatar.png",
                    "userPhoneNumber": "18041168030",
                    "userPermission": 0
                },
                "course": {
                    "courseId": 2,
                    "languageType": {
                        "languageTypeId": 5,
                        "languageName": "中文",
                        "languageIconUrl": "/SSLearningTeam/Languages/987a7e8a-7815-4b46-82ab-c870eeaf7510_language.png"
                    },
                    "rateType": {
                        "rateTypeId": 2,
                        "languageType": null,
                        "rateName": "二级",
                        "rateIconUrl": "/SSLearningTeam/Ratetypes/28b165d6-7441-4af4-beb0-916939e90614_ratetype.png"
                    },
                    "courseName": "测试阅读1s",
                    "courseChineseContent": "测试s",
                    "courseEnglishContent": "tests",
                    "courseResourceUrl": null,
                    "downloadNum": 2,
                    "instructionImgUrl": "/SSLearningTeam/ReadingCourseResource/43edaca2-f178-4b6e-baee-d82adaa5d2d11.png"
                },
                "recentRecordingTime": 1535766721000,
                "viewTimes": 2
            }
        ],
        "currentPage": 1
    }
}
```

- 失败时返回内容

```json
{
    "status": false,
    "info": "您还没有浏览历史"
}
```

#### 2.4 返回参数

过于简单，不作讲解

<hr/>

## 口语评测相关接口

### 1.查看指定用户口语课程平均分数

#### 1.1 请求说明

> 请求方式：GET
> 请求URL ：/course/admin/getAvgOralCourseScoreOfUser 

#### 1.2 请求参数

| 字段   | 类型 | 含义                               |
| ------ | ---- | ---------------------------------- |
| userId | int  | 用户Id(如果可以传cookie则可以不传) |

#### 1.3 返回结果接收

- 成功时返回内容

```json  
{
    "status": true,
    "info": 90
}
```

- 失败时返回内容

```json
{
    "status": false,
    "info": "用户暂未参加口语测评"
}
```

#### 1.4 返回参数

过于简单，不作讲解

<hr/>

## 用户签到相关接口

### 1.查看指定用户签到的天数 

#### 1.1 请求说明

> 请求方式：GET
> 请求URL ：/user/admin/getUserSignInRecording 

#### 1.2 请求参数

| 字段   | 类型 | 含义   |
| ------ | ---- | ------ |
| userId | int  | 用户Id |

#### 1.3 返回结果接收

- 成功时返回内容（不管什么情况，都会查到对应的签到天数）

```json  
{
    "status": true,
    "info": {
        "signInId": 1,
        "userId": 3,
        "totalTimes": 0,
        "recentMark": null
    }
}
```

#### 1.4 返回参数

过于简单，不作讲解

### 2.修改用户连续签到天数

#### 2.1 请求说明

> 请求方式：GET
> 请求URL ：/user/admin/updateSignInRecording

#### 2.2 请求参数

| 字段       | 类型 | 含义           |
| ---------- | ---- | -------------- |
| userId     | int  | 用户Id         |
| totalTimes | int  | 修改总签到天数 |

#### 2.3 返回结果接收

- 成功时返回内容

```json  
{
    "status": true,
    "info": "修改成功"
}
```

* 失败时返回内容

```json
{
    "status": false,
    "info": "修改失败"
}
```

#### 2.4 返回参数

过于简单，不作讲解



<hr/>

## 追加补充内容

### 1.语言类别查重接口JSON

#### 1.1 请求说明

> 请求方式：GET
> 请求URL ：/language/admin/selectLanguageNameRepeat 

#### 1.2 请求参数

| 字段         | 字段类型 | 字段说明 |
| ------------ | -------- | -------- |
| languageName | string   | 语言名称 |

#### 1.3 返回结果接收

* 成功时返回内容

```json  
{
    "status": true,
    "info": "您输入的语言类别不存在，可以使用该名称!"
}
```

* 失败时返回内容

```json
{
    "status": false,
    "info": "您输入的语言类别名称已存在，请重新输入!"
}
```

#### 1.4 返回参数

过于简单，不作讲解

### 2.种类类别查重接口JSON

#### 2.1 请求说明

> 请求方式：GET
> 请求URL ：/ratetype/admin/selectRateNameRepeat

#### 2.2 请求参数

| 字段     | 字段类型 | 字段说明     |
| -------- | -------- | ------------ |
| rateName | string   | 种类类别名称 |

#### 2.3 返回结果接收

- 成功时返回内容

```json  
{
    "status": true,
    "info": "您输入的种类类别不存在，可以使用该名称!"
}
```

- 失败时返回内容

```json
{
    "status": false,
    "info": "您输入的种类类别名称已存在，请重新输入!"
}
```

#### 2.4 返回参数

过于简单，不作讲解

