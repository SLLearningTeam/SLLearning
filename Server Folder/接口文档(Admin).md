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

#### 