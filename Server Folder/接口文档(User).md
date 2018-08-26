## 接口文档（用户）

### 1.用户获取语言信息[分不分页都写了,不传pageNum就是获取所有的)]

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

#### 2.1 功能描述

用户获取种类类别信息

#### 2.2 请求说明

> 请求方式：GET
> 请求URL ：/language/user/getratetypes/{pageNum} 
>
> URL参数含义：pageNum表示当前页号

#### 2.3 请求参数

无

#### 2.4 返回结果接收

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

#### 2.5 返回参数

| 字段            | 字段类型 | 字段说明         |
| --------------- | -------- | ---------------- |
| languageTypeId  | Int      | 语言类别Id       |
| languageName    | string   | 语言类别名称     |
| languageIconUrl | string   | 语言类别图标地址 |
| rateTypeId      | Int      | 类别类型Id       |
| rateName        | string   | 类别类型名称     |
| rateIconUrl     | string   | 类别类型图标Url  |

### 3.用户通过语言获取种类类别信息

#### 3.1 功能描述

用户通过语言获取种类类别信息

#### 3.2 请求说明

> 请求方式：GET
> 请求URL ：/ratetype/user/getratetypebylanguagetypeid 

#### 3.3 请求参数

| 字段           | 字段类型 | 字段说明   |
| -------------- | -------- | ---------- |
| languageTypeId | int      | 语言类别Id |

#### 3.4 返回结果接收

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

#### 3.5 返回参数

| 字段           | 字段类型 | 字段说明    |
| -------------- | -------- | ----------- |
| rateTypeId     | Int      | 类别类型Id  |
| languageTypeId | int      | 语言类别Id  |
| rateName       | string   | 类别名称    |
| rateIconUrl    | string   | 类别图标Url |

### 4.用户获取综合课程列表（听力、口语、阅读都有）

#### 4.1 功能描述

用户获取综合课程列表（听力、口语、阅读都有）

#### 4.2 请求说明

> 请求方式：GET
> 请求URL ：/course/user/courses_manage/{pageNum}  
>
> pageNum表示页号

#### 4.3 请求参数

无

#### 4.4 返回结果接收

```json  
{
    "status": true,
    "info": {
        "courses": {
            "readingCourses": [
                {
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
                    "courseEnglishContent": "tests",
                    "courseResourceUrl": null,
                    "downloadNum": 2,
                    "instructionImgUrl": "/SSLearningTeam/ReadingCourseResource/43edaca2-f178-4b6e-baee-d82adaa5d2d11.png",
                    "courseChineseContent": "测试s"
                }
            ],
            "oralCourses": [
                {
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
                    "courseName": "测试口语1",
                    "courseEnglishContent": "tests",
                    "courseResourceUrl": null,
                    "downloadNum": 3,
                    "instructionImgUrl": "/SSLearningTeam/OralCourseResource/e428d718-73cb-411a-9fe9-2e7a3b3f5013成功.png",
                    "courseChineseContent": "测试s"
                }
            ],
            "listeningCourses": [
                {
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
                    "courseEnglishContent": "Chinese",
                    "courseResourceUrl": "/SSLearningTeam/ListeningCourseResource/38693414-c968-4c78-8b84-3c219dc8d79a学员网页端.mp3",
                    "downloadNum": 0,
                    "instructionImgUrl": "/SSLearningTeam/ListeningCourseResource/22e3b1a2-0075-494b-850b-67cd18ac57c7中文.png",
                    "courseChineseContent": "中文"
                },
                {
                    "courseId": 3,
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
                    "courseName": "测试听力2",
                    "courseEnglishContent": "English",
                    "courseResourceUrl": "/SSLearningTeam/ListeningCourseResource/e1f53648-64a0-4b7b-af59-4cee36b8149f学员网页端.mp3",
                    "downloadNum": 0,
                    "instructionImgUrl": "/SSLearningTeam/ListeningCourseResource/bed0730d-5012-4e17-8923-a2f952c63bcb英文.png",
                    "courseChineseContent": "英文"
                },
                {
                    "courseId": 4,
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
                    "courseName": "测试听力3",
                    "courseEnglishContent": "listening",
                    "courseResourceUrl": "/SSLearningTeam/ListeningCourseResource/521bc7f2-c9c5-41b6-96a5-fe6b2c7839f9学员网页端.mp3",
                    "downloadNum": 0,
                    "instructionImgUrl": "/SSLearningTeam/ListeningCourseResource/417c1422-94c0-4b2d-831e-22fc97bc7020中文.png",
                    "courseChineseContent": "听力"
                },
                {
                    "courseId": 5,
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
                    "courseName": "测试听力99s",
                    "courseEnglishContent": "lalaa99ss",
                    "courseResourceUrl": "/SSLearningTeam/ListeningCourseResource/c020b6f7-676a-4650-94bf-9cb660306280学员网页端.mp3",
                    "downloadNum": 3,
                    "instructionImgUrl": "/SSLearningTeam/ListeningCourseResource/10520d9e-06c2-46bc-a218-2d42382ea384java.jpeg",
                    "courseChineseContent": "啦啦a99ss"
                }
            ]
        },
        "totalPages": 1,
        "currentPage": 1
    }
}
```

#### 4.5 返回参数

| 字段        | 字段类型 | 字段说明     |
| ----------- | -------- | ------------ |
| totalPages  | Int      | 总页数       |
| currentPage | int      | 当前页数     |
| courses     | Object   | 所有课程对象 |

### 5.用户获取听力课程列表

#### 5.1 功能描述

用户获取听力课程列表

#### 5.2 请求说明

> 请求方式：GET
> 请求URL ：/course/user/listeningCourses_manage/{pageNum}
>
> pageNum表示页号

#### 5.3 请求参数

无

#### 5.4 返回结果接收

```json  
{
    "status": true,
    "info": {
        "courses": {
            "readingCourses": [],
            "oralCourses": [],
            "listeningCourses": [
                {
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
                    "courseEnglishContent": "Chinese",
                    "courseResourceUrl": "/SSLearningTeam/ListeningCourseResource/38693414-c968-4c78-8b84-3c219dc8d79a学员网页端.mp3",
                    "downloadNum": 0,
                    "instructionImgUrl": "/SSLearningTeam/ListeningCourseResource/22e3b1a2-0075-494b-850b-67cd18ac57c7中文.png",
                    "courseChineseContent": "中文"
                },
                {
                    "courseId": 3,
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
                    "courseName": "测试听力2",
                    "courseEnglishContent": "English",
                    "courseResourceUrl": "/SSLearningTeam/ListeningCourseResource/e1f53648-64a0-4b7b-af59-4cee36b8149f学员网页端.mp3",
                    "downloadNum": 0,
                    "instructionImgUrl": "/SSLearningTeam/ListeningCourseResource/bed0730d-5012-4e17-8923-a2f952c63bcb英文.png",
                    "courseChineseContent": "英文"
                },
                {
                    "courseId": 4,
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
                    "courseName": "测试听力3",
                    "courseEnglishContent": "listening",
                    "courseResourceUrl": "/SSLearningTeam/ListeningCourseResource/521bc7f2-c9c5-41b6-96a5-fe6b2c7839f9学员网页端.mp3",
                    "downloadNum": 0,
                    "instructionImgUrl": "/SSLearningTeam/ListeningCourseResource/417c1422-94c0-4b2d-831e-22fc97bc7020中文.png",
                    "courseChineseContent": "听力"
                },
                {
                    "courseId": 5,
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
                    "courseName": "测试听力99s",
                    "courseEnglishContent": "lalaa99ss",
                    "courseResourceUrl": "/SSLearningTeam/ListeningCourseResource/c020b6f7-676a-4650-94bf-9cb660306280学员网页端.mp3",
                    "downloadNum": 3,
                    "instructionImgUrl": "/SSLearningTeam/ListeningCourseResource/10520d9e-06c2-46bc-a218-2d42382ea384java.jpeg",
                    "courseChineseContent": "啦啦a99ss"
                }
            ]
        },
        "totalPages": 1,
        "currentPage": 1
    }
}
```

#### 5.5 返回参数

| 字段        | 字段类型 | 字段说明 |
| ----------- | -------- | -------- |
| totalPages  | Int      | 总页数   |
| currentPage | int      | 当前页数 |
| courses     | Object   | 课程对象 |

### 6.用户获取听力课程列表（按下载量排序）

#### 6.1 功能描述

用户获取听力课程列表

#### 6.2 请求说明

> 请求方式：GET
> 请求URL ：/course/user/listeningCourses_manageByDownload/{pageNum} 
>
> pageNum表示页号

#### 6.3 请求参数

无

#### 6.4 返回结果接收

```json  
{
    "status": true,
    "info": {
        "courses": {
            "readingCourses": [],
            "oralCourses": [],
            "listeningCourses": [
                {
                    "courseId": 4,
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
                    "courseName": "测试听力3",
                    "courseEnglishContent": "listening",
                    "courseResourceUrl": "/SSLearningTeam/ListeningCourseResource/521bc7f2-c9c5-41b6-96a5-fe6b2c7839f9学员网页端.mp3",
                    "downloadNum": 5,
                    "instructionImgUrl": "/SSLearningTeam/ListeningCourseResource/417c1422-94c0-4b2d-831e-22fc97bc7020中文.png",
                    "courseChineseContent": "听力"
                },
                {
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
                    "courseEnglishContent": "Chinese",
                    "courseResourceUrl": "/SSLearningTeam/ListeningCourseResource/38693414-c968-4c78-8b84-3c219dc8d79a学员网页端.mp3",
                    "downloadNum": 4,
                    "instructionImgUrl": "/SSLearningTeam/ListeningCourseResource/22e3b1a2-0075-494b-850b-67cd18ac57c7中文.png",
                    "courseChineseContent": "中文"
                },
                {
                    "courseId": 5,
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
                    "courseName": "测试听力99s",
                    "courseEnglishContent": "lalaa99ss",
                    "courseResourceUrl": "/SSLearningTeam/ListeningCourseResource/c020b6f7-676a-4650-94bf-9cb660306280学员网页端.mp3",
                    "downloadNum": 3,
                    "instructionImgUrl": "/SSLearningTeam/ListeningCourseResource/10520d9e-06c2-46bc-a218-2d42382ea384java.jpeg",
                    "courseChineseContent": "啦啦a99ss"
                },
                {
                    "courseId": 3,
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
                    "courseName": "测试听力2",
                    "courseEnglishContent": "English",
                    "courseResourceUrl": "/SSLearningTeam/ListeningCourseResource/e1f53648-64a0-4b7b-af59-4cee36b8149f学员网页端.mp3",
                    "downloadNum": 1,
                    "instructionImgUrl": "/SSLearningTeam/ListeningCourseResource/bed0730d-5012-4e17-8923-a2f952c63bcb英文.png",
                    "courseChineseContent": "英文"
                }
            ]
        },
        "totalPages": 1,
        "currentPage": 1
    }
}
```

#### 6.5 返回参数

| 字段        | 字段类型 | 字段说明     |
| ----------- | -------- | ------------ |
| totalPages  | Int      | 总页数       |
| currentPage | int      | 当前页数     |
| courses     | Object   | 听力课程对象 |

### 7.用户获取筛选指定语言类别的听力课程列表 

#### 7.1 功能描述

用户获取筛选指定语言类别的听力课程列表 

#### 7.2 请求说明

> 请求方式：GET
> 请求URL ：/course/user/listeningCourses_manageByLanguageType/{pageNum} 
>
> pageNum表示页号

#### 7.3 请求参数

| 字段           | 字段类型 | 字段说明   |
| -------------- | -------- | ---------- |
| languageTypeId | int      | 语言类别Id |

#### 7.4 返回结果接收

```json  
{
    "status": true,
    "info": {
        "courses": {
            "readingCourses": [],
            "oralCourses": [],
            "listeningCourses": [
                {
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
                    "courseEnglishContent": "Chinese",
                    "courseResourceUrl": "/SSLearningTeam/ListeningCourseResource/38693414-c968-4c78-8b84-3c219dc8d79a学员网页端.mp3",
                    "downloadNum": 4,
                    "instructionImgUrl": "/SSLearningTeam/ListeningCourseResource/22e3b1a2-0075-494b-850b-67cd18ac57c7中文.png",
                    "courseChineseContent": "中文"
                },
                {
                    "courseId": 3,
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
                    "courseName": "测试听力2",
                    "courseEnglishContent": "English",
                    "courseResourceUrl": "/SSLearningTeam/ListeningCourseResource/e1f53648-64a0-4b7b-af59-4cee36b8149f学员网页端.mp3",
                    "downloadNum": 1,
                    "instructionImgUrl": "/SSLearningTeam/ListeningCourseResource/bed0730d-5012-4e17-8923-a2f952c63bcb英文.png",
                    "courseChineseContent": "英文"
                },
                {
                    "courseId": 4,
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
                    "courseName": "测试听力3",
                    "courseEnglishContent": "listening",
                    "courseResourceUrl": "/SSLearningTeam/ListeningCourseResource/521bc7f2-c9c5-41b6-96a5-fe6b2c7839f9学员网页端.mp3",
                    "downloadNum": 5,
                    "instructionImgUrl": "/SSLearningTeam/ListeningCourseResource/417c1422-94c0-4b2d-831e-22fc97bc7020中文.png",
                    "courseChineseContent": "听力"
                },
                {
                    "courseId": 5,
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
                    "courseName": "测试听力99s",
                    "courseEnglishContent": "lalaa99ss",
                    "courseResourceUrl": "/SSLearningTeam/ListeningCourseResource/c020b6f7-676a-4650-94bf-9cb660306280学员网页端.mp3",
                    "downloadNum": 3,
                    "instructionImgUrl": "/SSLearningTeam/ListeningCourseResource/10520d9e-06c2-46bc-a218-2d42382ea384java.jpeg",
                    "courseChineseContent": "啦啦a99ss"
                }
            ]
        },
        "totalPages": 1,
        "currentPage": 1
    }
}
```

#### 7.5 返回参数

| 字段        | 字段类型 | 字段说明 |
| ----------- | -------- | -------- |
| totalPages  | Int      | 总页数   |
| currentPage | int      | 当前页数 |
| courses     | Object   | 课程对象 |

### 8.用户获取筛选指定种类类别(种类类别已经确定了语言类别)的听力课程列表 

#### 8.1 功能描述

用户获取筛选指定种类类别(种类类别已经确定了语言类别)的听力课程列表 

#### 8.2 请求说明

> 请求方式：GET
> 请求URL ：/course/user/listeningCourses_manageByRateType/{pageNum} 
>
> pageNum表示页号

#### 8.3 请求参数

| 字段       | 字段类型 | 字段说明   |
| ---------- | -------- | ---------- |
| rateTypeId | int      | 种类类别Id |

#### 8.4 返回结果接收

```json  
{
    "status": true,
    "info": {
        "courses": {
            "readingCourses": [],
            "oralCourses": [],
            "listeningCourses": [
                {
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
                    "courseEnglishContent": "Chinese",
                    "courseResourceUrl": "/SSLearningTeam/ListeningCourseResource/38693414-c968-4c78-8b84-3c219dc8d79a学员网页端.mp3",
                    "downloadNum": 4,
                    "instructionImgUrl": "/SSLearningTeam/ListeningCourseResource/22e3b1a2-0075-494b-850b-67cd18ac57c7中文.png",
                    "courseChineseContent": "中文"
                },
                {
                    "courseId": 3,
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
                    "courseName": "测试听力2",
                    "courseEnglishContent": "English",
                    "courseResourceUrl": "/SSLearningTeam/ListeningCourseResource/e1f53648-64a0-4b7b-af59-4cee36b8149f学员网页端.mp3",
                    "downloadNum": 1,
                    "instructionImgUrl": "/SSLearningTeam/ListeningCourseResource/bed0730d-5012-4e17-8923-a2f952c63bcb英文.png",
                    "courseChineseContent": "英文"
                },
                {
                    "courseId": 4,
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
                    "courseName": "测试听力3",
                    "courseEnglishContent": "listening",
                    "courseResourceUrl": "/SSLearningTeam/ListeningCourseResource/521bc7f2-c9c5-41b6-96a5-fe6b2c7839f9学员网页端.mp3",
                    "downloadNum": 5,
                    "instructionImgUrl": "/SSLearningTeam/ListeningCourseResource/417c1422-94c0-4b2d-831e-22fc97bc7020中文.png",
                    "courseChineseContent": "听力"
                },
                {
                    "courseId": 5,
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
                    "courseName": "测试听力99s",
                    "courseEnglishContent": "lalaa99ss",
                    "courseResourceUrl": "/SSLearningTeam/ListeningCourseResource/c020b6f7-676a-4650-94bf-9cb660306280学员网页端.mp3",
                    "downloadNum": 3,
                    "instructionImgUrl": "/SSLearningTeam/ListeningCourseResource/10520d9e-06c2-46bc-a218-2d42382ea384java.jpeg",
                    "courseChineseContent": "啦啦a99ss"
                }
            ]
        },
        "totalPages": 1,
        "currentPage": 1
    }
}
```

#### 8.5 返回参数

| 字段        | 字段类型 | 字段说明 |
| ----------- | -------- | -------- |
| totalPages  | Int      | 总页数   |
| currentPage | int      | 当前页数 |
| courses     | Object   | 课程对象 |

### 9.用户获取口语课程列表

#### 9.1 功能描述

用户获取口语课程列表

#### 9.2 请求说明

> 请求方式：GET
> 请求URL ：/course/user/oralCourses_manage/{pageNum} 
>
> pageNum表示页号

#### 9.3 请求参数

无

#### 9.4 返回结果接收

```json  
{
    "status": true,
    "info": {
        "courses": {
            "readingCourses": [],
            "oralCourses": [
                {
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
                    "courseName": "测试口语1",
                    "courseEnglishContent": "tests",
                    "courseResourceUrl": null,
                    "downloadNum": 3,
                    "instructionImgUrl": "/SSLearningTeam/OralCourseResource/e428d718-73cb-411a-9fe9-2e7a3b3f5013成功.png",
                    "courseChineseContent": "测试s"
                }
            ],
            "listeningCourses": []
        },
        "totalPages": 1,
        "currentPage": 1
    }
}
```

#### 9.5 返回参数

| 字段        | 字段类型 | 字段说明 |
| ----------- | -------- | -------- |
| totalPages  | Int      | 总页数   |
| currentPage | int      | 当前页数 |
| courses     | Object   | 课程对象 |

### 10.用户获取口语课程列表（按下载量排序）

#### 10.1 功能描述

用户获取口语课程列表

#### 10.2 请求说明

> 请求方式：GET
> 请求URL ：/course/user/oralCourses_manageByDownload/{pageNum} 
>
> pageNum表示页号

#### 10.3 请求参数

无

#### 10.4 返回结果接收

```json  
{
    "status": true,
    "info": {
        "courses": {
            "readingCourses": [],
            "oralCourses": [
                {
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
                    "courseName": "测试口语1",
                    "courseEnglishContent": "tests",
                    "courseResourceUrl": null,
                    "downloadNum": 3,
                    "instructionImgUrl": "/SSLearningTeam/OralCourseResource/e428d718-73cb-411a-9fe9-2e7a3b3f5013成功.png",
                    "courseChineseContent": "测试s"
                }
            ],
            "listeningCourses": []
        },
        "totalPages": 1,
        "currentPage": 1
    }
}
```

#### 10.5 返回参数

| 字段        | 字段类型 | 字段说明     |
| ----------- | -------- | ------------ |
| totalPages  | Int      | 总页数       |
| currentPage | int      | 当前页数     |
| courses     | Object   | 听力课程对象 |

### 11.用户获取筛选指定语言类别的口语课程列表 

#### 11.1 功能描述

用户获取筛选指定语言类别的口语课程列表 

#### 11.2 请求说明

> 请求方式：GET
> 请求URL ：/course/user/oralCourses_manageByLanguageType/{pageNum} 
>
> pageNum表示页号

#### 11.3 请求参数

| 字段           | 字段类型 | 字段说明   |
| -------------- | -------- | ---------- |
| languageTypeId | int      | 语言类别Id |

#### 11.4 返回结果接收

```json  
{
    "status": true,
    "info": {
        "courses": {
            "readingCourses": [],
            "oralCourses": [
                {
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
                    "courseName": "测试口语1",
                    "courseEnglishContent": "tests",
                    "courseResourceUrl": null,
                    "downloadNum": 3,
                    "instructionImgUrl": "/SSLearningTeam/OralCourseResource/e428d718-73cb-411a-9fe9-2e7a3b3f5013成功.png",
                    "courseChineseContent": "测试s"
                }
            ],
            "listeningCourses": []
        },
        "totalPages": 1,
        "currentPage": 1
    }
}
```

#### 11.5 返回参数

| 字段        | 字段类型 | 字段说明 |
| ----------- | -------- | -------- |
| totalPages  | Int      | 总页数   |
| currentPage | int      | 当前页数 |
| courses     | Object   | 课程对象 |

### 12.用户获取筛选指定种类类别(种类类别已经确定了语言类别)的口语课程列表 

#### 12.1 功能描述

用户获取筛选指定种类类别(种类类别已经确定了语言类别)的口语课程列表 

#### 12.2 请求说明

> 请求方式：GET
> 请求URL ：/course/user/oralCourses_manageByRateType/{pageNum} 
>
> pageNum表示页号

#### 12.3 请求参数

| 字段       | 字段类型 | 字段说明   |
| ---------- | -------- | ---------- |
| rateTypeId | int      | 种类类别Id |

#### 12.4 返回结果接收

```json  
{
    "status": true,
    "info": {
        "courses": {
            "readingCourses": [],
            "oralCourses": [
                {
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
                    "courseName": "测试口语1",
                    "courseEnglishContent": "tests",
                    "courseResourceUrl": null,
                    "downloadNum": 3,
                    "instructionImgUrl": "/SSLearningTeam/OralCourseResource/e428d718-73cb-411a-9fe9-2e7a3b3f5013成功.png",
                    "courseChineseContent": "测试s"
                }
            ],
            "listeningCourses": []
        },
        "totalPages": 1,
        "currentPage": 1
    }
}
```

#### 12.5 返回参数

| 字段        | 字段类型 | 字段说明 |
| ----------- | -------- | -------- |
| totalPages  | Int      | 总页数   |
| currentPage | int      | 当前页数 |
| courses     | Object   | 课程对象 |

### 13.用户获取阅读课程列表

#### 13.1 功能描述

用户获取阅读课程列表

#### 13.2 请求说明

> 请求方式：GET
> 请求URL ：/course/user/readingCourses_manage/{pageNum} 
>
> pageNum表示页号

#### 13.3 请求参数

无

#### 13.4 返回结果接收

```json  
{
    "status": true,
    "info": {
        "courses": {
            "readingCourses": [
                {
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
                    "courseEnglishContent": "tests",
                    "courseResourceUrl": null,
                    "downloadNum": 2,
                    "instructionImgUrl": "/SSLearningTeam/ReadingCourseResource/43edaca2-f178-4b6e-baee-d82adaa5d2d11.png",
                    "courseChineseContent": "测试s"
                }
            ],
            "oralCourses": [],
            "listeningCourses": []
        },
        "totalPages": 1,
        "currentPage": 1
    }
}
```

#### 13.5 返回参数

| 字段        | 字段类型 | 字段说明 |
| ----------- | -------- | -------- |
| totalPages  | Int      | 总页数   |
| currentPage | int      | 当前页数 |
| courses     | Object   | 课程对象 |

### 14.用户获取阅读课程列表（按下载量排序）

#### 14.1 功能描述

用户获取阅读课程列表

#### 14.2 请求说明

> 请求方式：GET
> 请求URL ：/course/user/readingCourses_manageByDownload/{pageNum} 
>
> pageNum表示页号

#### 14.3 请求参数

无

#### 14.4 返回结果接收

```json  
{
    "status": true,
    "info": {
        "courses": {
            "readingCourses": [
                {
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
                    "courseEnglishContent": "tests",
                    "courseResourceUrl": null,
                    "downloadNum": 2,
                    "instructionImgUrl": "/SSLearningTeam/ReadingCourseResource/43edaca2-f178-4b6e-baee-d82adaa5d2d11.png",
                    "courseChineseContent": "测试s"
                }
            ],
            "oralCourses": [],
            "listeningCourses": []
        },
        "totalPages": 1,
        "currentPage": 1
    }
}
```

#### 14.5 返回参数

| 字段        | 字段类型 | 字段说明     |
| ----------- | -------- | ------------ |
| totalPages  | Int      | 总页数       |
| currentPage | int      | 当前页数     |
| courses     | Object   | 听力课程对象 |

### 15.用户获取筛选指定语言类别的阅读课程列表 

#### 15.1 功能描述

用户获取筛选指定语言类别的阅读课程列表 

#### 15.2 请求说明

> 请求方式：GET
> 请求URL ：/course/user/readingCourses_manageByLanguageType/{pageNum} 
>
> pageNum表示页号

#### 15.3 请求参数

| 字段           | 字段类型 | 字段说明   |
| -------------- | -------- | ---------- |
| languageTypeId | int      | 语言类别Id |

#### 15.4 返回结果接收

```json  
{
    "status": true,
    "info": {
        "courses": {
            "readingCourses": [
                {
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
                    "courseEnglishContent": "tests",
                    "courseResourceUrl": null,
                    "downloadNum": 2,
                    "instructionImgUrl": "/SSLearningTeam/ReadingCourseResource/43edaca2-f178-4b6e-baee-d82adaa5d2d11.png",
                    "courseChineseContent": "测试s"
                }
            ],
            "oralCourses": [],
            "listeningCourses": []
        },
        "totalPages": 1,
        "currentPage": 1
    }
}
```

#### 15.5 返回参数

| 字段        | 字段类型 | 字段说明 |
| ----------- | -------- | -------- |
| totalPages  | Int      | 总页数   |
| currentPage | int      | 当前页数 |
| courses     | Object   | 课程对象 |

### 16.用户获取筛选指定种类类别(种类类别已经确定了语言类别)的阅读课程列表 

#### 16.1 功能描述

用户获取筛选指定种类类别(种类类别已经确定了语言类别)的阅读课程列表 

#### 16.2 请求说明

> 请求方式：GET
> 请求URL ：/course/user/readingCourses_manageByRateType/{pageNum} 
>
> pageNum表示页号

#### 16.3 请求参数

| 字段       | 字段类型 | 字段说明   |
| ---------- | -------- | ---------- |
| rateTypeId | int      | 种类类别Id |

#### 16.4 返回结果接收

```json  
{
    "status": true,
    "info": {
        "courses": {
            "readingCourses": [
                {
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
                    "courseEnglishContent": "tests",
                    "courseResourceUrl": null,
                    "downloadNum": 2,
                    "instructionImgUrl": "/SSLearningTeam/ReadingCourseResource/43edaca2-f178-4b6e-baee-d82adaa5d2d11.png",
                    "courseChineseContent": "测试s"
                }
            ],
            "oralCourses": [],
            "listeningCourses": []
        },
        "totalPages": 1,
        "currentPage": 1
    }
}
```

#### 16.5 返回参数

| 字段        | 字段类型 | 字段说明 |
| ----------- | -------- | -------- |
| totalPages  | Int      | 总页数   |
| currentPage | int      | 当前页数 |
| courses     | Object   | 课程对象 |

### 17.查看所有轮播图列表JSON 

#### 17.1 功能描述

查看所有轮播图列表JSON 

#### 17.2 请求说明

> 请求方式：GET
> 请求URL ：/course/user/getCarouselMaps 

#### 17.3 请求参数

无

#### 17.4 返回结果接收

```json  

```

#### 17.5 返回参数

| 字段        | 类型              | 含义           |
| ----------- | ----------------- | -------------- |
| carouselMap | List<CarouselMap> | 轮播图对象集合 |



