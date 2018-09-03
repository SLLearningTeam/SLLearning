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
> 请求URL ：/website/user/getCarouselMaps 

#### 17.3 请求参数

无

#### 17.4 返回结果接收

```json  
{
    "status": true,
    "info": [
        {
            "carouselId": 0,
            "carouselInstruction": "轮播图1",
            "carouselImgUrl": "/SSLearningTeam/CarouselMaps/5bdf3f5c-1786-4b13-9423-5c4b944e5212_carouselMap.png",
            "carouselLinkUrl": "www.baidu.com"
        },
        {
            "carouselId": 0,
            "carouselInstruction": "轮播图2",
            "carouselImgUrl": "/SSLearningTeam/CarouselMaps/5a74771d-4de9-4342-9f58-6e47fd8dd8ee_carouselMap.png",
            "carouselLinkUrl": "www.souhu.com"
        }
    ]
}
```

#### 17.5 返回参数

| 字段        | 类型              | 含义           |
| ----------- | ----------------- | -------------- |
| carouselMap | List<CarouselMap> | 轮播图对象集合 |

### 18.用户下载听力课程资源 

#### 18.1 功能描述

用户下载听力课程资源

#### 18.2 请求说明

> 请求方式：GET
> 请求URL ：/course/user/downloadListeningCourse 

#### 18.3 请求参数

| 字段     | 字段类型 | 字段说明                                   |
| -------- | -------- | ------------------------------------------ |
| userId   | int      | 用户ID（如可以传JSESSIONID则不用传userId） |
| courseId | int      | 课程Id                                     |
| fileName | string   | 文件url                                    |

#### 18.4 返回结果接收

返回文件

#### 18.5 返回参数

无

### 19.用户查看所有下载的历史 

#### 19.1 功能描述

用户查看所有下载的历史

#### 19.2 请求说明

> 请求方式：GET
> 请求URL ：/user/getDownloadRecordings/{pageNum}  
>
> pageNum表示页号

#### 19.3 请求参数

| 字段   | 字段类型 | 字段说明                                           |
| ------ | -------- | -------------------------------------------------- |
| userId | int      | 用户Id（如果可以回传JSESSIONID则可以不用传递此值） |

#### 19.4 返回结果接收

```json  
{
    "status": true,
    "info": {
        "downloadRecordings": [
            {
                "downloadRecordingId": 3,
                "user": {
                    "userId": 3,
                    "userSex": "女",
                    "userName": "Amy",
                    "userPassword": "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92",
                    "userAvatarUrl": "/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/616b55f8-8df9-49ac-9247-a1bd1780391918041168030Avatar.png",
                    "userPhoneNumber": "18041168030",
                    "userPermission": 0
                },
                "courseType": "listeningcourse",
                "course": {
                    "courseId": 3,
                    "languageType": null,
                    "rateType": null,
                    "courseName": "测试听力2",
                    "courseEnglishContent": "English",
                    "courseResourceUrl": "/SSLearningTeam/ListeningCourseResource/e1f53648-64a0-4b7b-af59-4cee36b8149f学员网页端.mp3",
                    "downloadNum": 2,
                    "instructionImgUrl": "/SSLearningTeam/ListeningCourseResource/bed0730d-5012-4e17-8923-a2f952c63bcb英文.png"
                },
                "downloadRecordingTime": 1535369123000
            }
        ],
        "totalPage": 1,
        "currentPage": 1
    }
}
```

#### 19.5 返回参数

| 字段               | 类型                     | 含义         |
| ------------------ | ------------------------ | ------------ |
| downloadRecordings | List< DownloadRecording> | 下载对象集合 |
| pageNumber         | Integer                  | 总页数       |
| currentPage        | Integer                  | 当前页号     |

### 20.用户删除指定下载的记录

#### 20.1 请求说明

> 请求方式：GET
> 请求URL ：/website/user/deleteDownloadRecording 

#### 20.2 请求参数

| 字段                | 类型 | 含义       |
| ------------------- | ---- | ---------- |
| downloadRecordingId | int  | 下载记录Id |

#### 20.3 返回结果接收

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

#### 20.4 返回参数

过于简单，不作讲解

### 21.查看指定课程的所有问题 

#### 21.1 请求说明

> 请求方式：GET
> 请求URL ：/course/user/getAllQuestion  

#### 21.2 请求参数

| 字段       | 类型   | 含义     |
| ---------- | ------ | -------- |
| courseType | string | 课程类型 |
| courseId   | int    | 课程Id   |

#### 21.3 返回结果接收

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

#### 21.4 返回参数

过于简单，不作讲解

### 22.上传意见反馈

#### 22.1 请求说明

> 请求方式：POST
> 请求URL ：/advice/user/addAdvice 

#### 22.2 请求参数

| 字段       | 类型   | 含义                               |
| ---------- | ------ | ---------------------------------- |
| userId     | int    | 用户Id（如果可以传cookie则不用传） |
| adviceInfo | string | 建议内容                           |

#### 22.3 返回结果接收

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

#### 22.4 返回参数

过于简单，不作讲解

### 23.删除意见反馈

#### 23.1 请求说明

> 请求方式：GET
> 请求URL ：/advice/user/deleteAdvice 

#### 23.2 请求参数

| 字段     | 类型 | 含义   |
| -------- | ---- | ------ |
| adviceId | int  | 建议Id |

#### 23.3 返回结果接收

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

#### 23.4 返回参数

过于简单，不作讲解

### 24.根据用户Id查看意见(分页) 

#### 24.1 请求说明

> 请求方式：GET
> 请求URL ：/advice/user/getAdviceByUserId/{pageNum} 
>
> pageNum表示当前页号

#### 24.2 请求参数

| 字段   | 类型 | 含义                               |
| ------ | ---- | ---------------------------------- |
| userId | int  | 用户Id(如果可以传cookie则可以不传) |

#### 24.3 返回结果接收

- 成功时返回内容

```json  
{
    "status": true,
    "info": {
        "adviceInfoList": [
            {
                "adviceId": 1,
                "user": {
                    "userId": 3,
                    "userSex": "女",
                    "userName": "Amy",
                    "userPassword": "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92",
                    "userAvatarUrl": "/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/616b55f8-8df9-49ac-9247-a1bd1780391918041168030Avatar.png",
                    "userPhoneNumber": "18041168030",
                    "userPermission": 0
                },
                "adviceSendTime": 1535736841000,
                "adviceInfo": "提交建议1"
            },
            {
                "adviceId": 2,
                "user": {
                    "userId": 3,
                    "userSex": "女",
                    "userName": "Amy",
                    "userPassword": "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92",
                    "userAvatarUrl": "/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/616b55f8-8df9-49ac-9247-a1bd1780391918041168030Avatar.png",
                    "userPhoneNumber": "18041168030",
                    "userPermission": 0
                },
                "adviceSendTime": 1535736863000,
                "adviceInfo": "提交建议2"
            },
            {
                "adviceId": 3,
                "user": {
                    "userId": 3,
                    "userSex": "女",
                    "userName": "Amy",
                    "userPassword": "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92",
                    "userAvatarUrl": "/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/616b55f8-8df9-49ac-9247-a1bd1780391918041168030Avatar.png",
                    "userPhoneNumber": "18041168030",
                    "userPermission": 0
                },
                "adviceSendTime": 1535736866000,
                "adviceInfo": "提交建议3"
            },
            {
                "adviceId": 4,
                "user": {
                    "userId": 3,
                    "userSex": "女",
                    "userName": "Amy",
                    "userPassword": "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92",
                    "userAvatarUrl": "/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/616b55f8-8df9-49ac-9247-a1bd1780391918041168030Avatar.png",
                    "userPhoneNumber": "18041168030",
                    "userPermission": 0
                },
                "adviceSendTime": 1535736870000,
                "adviceInfo": "提交建议4"
            },
            {
                "adviceId": 5,
                "user": {
                    "userId": 3,
                    "userSex": "女",
                    "userName": "Amy",
                    "userPassword": "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92",
                    "userAvatarUrl": "/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/616b55f8-8df9-49ac-9247-a1bd1780391918041168030Avatar.png",
                    "userPhoneNumber": "18041168030",
                    "userPermission": 0
                },
                "adviceSendTime": 1535736873000,
                "adviceInfo": "提交建议5"
            },
            {
                "adviceId": 6,
                "user": {
                    "userId": 3,
                    "userSex": "女",
                    "userName": "Amy",
                    "userPassword": "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92",
                    "userAvatarUrl": "/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/616b55f8-8df9-49ac-9247-a1bd1780391918041168030Avatar.png",
                    "userPhoneNumber": "18041168030",
                    "userPermission": 0
                },
                "adviceSendTime": 1535736876000,
                "adviceInfo": "提交建议6"
            },
            {
                "adviceId": 7,
                "user": {
                    "userId": 3,
                    "userSex": "女",
                    "userName": "Amy",
                    "userPassword": "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92",
                    "userAvatarUrl": "/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/616b55f8-8df9-49ac-9247-a1bd1780391918041168030Avatar.png",
                    "userPhoneNumber": "18041168030",
                    "userPermission": 0
                },
                "adviceSendTime": 1535736880000,
                "adviceInfo": "提交建议7"
            }
        ],
        "pageNumber": 1,
        "currentPage": 1
    }
}
```

#### 24.4 返回参数

过于简单，不作讲解

### 25.添加评分等级 

#### 25.1 请求说明

> 请求方式：POST
> 请求URL ：/course/user/addEvaluation  

#### 25.2 请求参数

| 字段            | 类型   | 含义                               |
| --------------- | ------ | ---------------------------------- |
| userId          | int    | 用户Id（如果可以传cookie则不用传） |
| courseType      | string | 课程类型                           |
| courseId        | int    | 课程Id                             |
| evaluationLevel | int    | 评分等级                           |

#### 25.3 返回结果接收

- 成功时返回内容

```json  
{
    "status": true,
    "info": "评分成功"
}
```

- 失败时返回内容

```json
{
    "status": false,
    "info": "评分失败"
}
```

#### 25.4 返回参数

过于简单，不作讲解

### 26.删除评分记录 

#### 26.1 请求说明

> 请求方式：GET
> 请求URL ：/course/user/deleteEvaluation 

#### 26.2 请求参数

| 字段         | 类型 | 含义       |
| ------------ | ---- | ---------- |
| evaluationId | int  | 评分记录Id |

#### 26.3 返回结果接收

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

#### 26.4 返回参数

过于简单，不作讲解

### 27.查看课程的综合评分 

#### 27.1 请求说明

> 请求方式：GET
> 请求URL ：/course/user/getAvgEvaluation 

#### 27.2 请求参数

| 字段       | 类型   | 含义     |
| ---------- | ------ | -------- |
| courseType | string | 课程类型 |
| courseId   | int    | 课程Id   |

#### 27.3 返回结果接收

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

#### 27.4 返回参数

| 字段 | 类型       | 含义                                             |
| ---- | ---------- | ------------------------------------------------ |
| info | int/string | 当有人评价时为评价的平均分，无人评价时为提示内容 |

### 28.查看指定课程的评分列表(分页)  

#### 28.1 请求说明

> 请求方式：GET
> 请求URL ：/course/user/getAllEvaluationOfCourse/{pageNum} 
>
> pageNum是页号

#### 28.2 请求参数

| 字段       | 类型   | 含义     |
| ---------- | ------ | -------- |
| courseType | string | 课程类型 |
| courseId   | int    | 课程Id   |

#### 28.3 返回结果接收

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

#### 28.4 返回参数

| 字段            | 类型                     | 含义     |
| --------------- | ------------------------ | -------- |
| evaluationForms | List<   EvaluationForm > | 评分集合 |
| pageNumber      | Integer                  | 总页数   |
| currentPage     | Integer                  | 当前页号 |

### 29.查看指定用户的所有评分信息(分页) 

#### 29.1 请求说明

> 请求方式：GET
> 请求URL ：/course/user/getAllEvaluationOfUser/{pageNum} 
>
> pageNum是页号

#### 29.2 请求参数

| 字段   | 类型 | 含义                               |
| ------ | ---- | ---------------------------------- |
| userId | int  | 用户Id（如果可以传cookie则不用传） |

#### 29.3 返回结果接收

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
    "info": "您没有对任何课程进行评价"
}
```

#### 29.4 返回参数

过于简单，不作讲解

### 30.查看听力课程详细信息[自动记录浏览历史]

#### 30.1 请求说明

> 请求方式：GET
> 请求URL ：/course/user/getListeningCourseInfo 

#### 30.2 请求参数

| 字段     | 类型 | 含义                               |
| -------- | ---- | ---------------------------------- |
| userId   | int  | 用户Id(如果可以传cookie则可以不传) |
| courseId | int  | 课程Id                             |

#### 30.3 返回结果接收

- 成功时返回内容

```json  
{
    "status": true,
    "info": {
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
        "downloadNum": 2,
        "instructionImgUrl": "/SSLearningTeam/ListeningCourseResource/bed0730d-5012-4e17-8923-a2f952c63bcb英文.png",
        "courseChineseContent": "英文"
    }
}
```

* 失败时返回内容

```json
{
    "status": false,
    "info": "您查询的课程不存在"
}
```

#### 30.4 返回参数

过于简单，不作讲解

### 31.查看口语课程详细信息[自动记录浏览历史]

#### 31.1 请求说明

> 请求方式：GET
> 请求URL ：/course/user/getOralCourseInfo 

#### 31.2 请求参数

| 字段     | 类型 | 含义                               |
| -------- | ---- | ---------------------------------- |
| userId   | int  | 用户Id(如果可以传cookie则可以不传) |
| courseId | int  | 课程Id                             |

#### 31.3 返回结果接收

- 成功时返回内容

```json  
{
    "status": true,
    "info": {
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
}
```

- 失败时返回内容

```json
{
    "status": false,
    "info": "您查询的课程不存在"
}
```

#### 31.4 返回参数

过于简单，不作讲解

### 32.查看阅读课程详细信息[自动记录浏览历史]

#### 32.1 请求说明

> 请求方式：GET
> 请求URL ：/course/user/getReadingCourseInfo 

#### 32.2 请求参数

| 字段     | 类型 | 含义                               |
| -------- | ---- | ---------------------------------- |
| userId   | int  | 用户Id(如果可以传cookie则可以不传) |
| courseId | int  | 课程Id                             |

#### 32.3 返回结果接收

- 成功时返回内容

```json  
{
    "status": true,
    "info": {
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
}
```

- 失败时返回内容

```json
{
    "status": false,
    "info": "您查询的课程不存在"
}
```

#### 32.4 返回参数

过于简单，不作讲解

### 33.删除浏览历史 

#### 33.1 请求说明

> 请求方式：GET
> 请求URL ：/course/user/deleteHistoryRecording

#### 33.2 请求参数

| 字段               | 类型 | 含义       |
| ------------------ | ---- | ---------- |
| historyRecordingId | int  | 历史记录Id |

#### 33.3 返回结果接收

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

#### 33.4 返回参数

过于简单，不作讲解

### 34.查看指定用户的浏览历史（分页） 

#### 34.1 请求说明

> 请求方式：GET
> 请求URL ：/course/user/getHistoryRecordingOfUser/{pageNum} 
>
> pageNum为页号

#### 34.2 请求参数

| 字段   | 类型 | 含义                               |
| ------ | ---- | ---------------------------------- |
| userId | int  | 用户Id(如果可以传cookie则可以不传) |

#### 34.3 返回结果接收

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

#### 34.4 返回参数

过于简单，不作讲解

### 35.查看指定用户指定口语课程历史分数

#### 35.1 请求说明

> 请求方式：GET
> 请求URL ：/course/user/getScoreOfUserForOralCourse 

#### 35.2 请求参数

| 字段       | 类型   | 含义                               |
| ---------- | ------ | ---------------------------------- |
| userId     | int    | 用户Id(如果可以传cookie则可以不传) |
| courseType | string | 课程类型                           |
| courseId   | int    | 课程ID                             |

#### 35.3 返回结果接收

- 成功时返回内容

```json  
{
    "status": true,
    "info": 60
}
```

- 失败时返回内容

```json
{
    "status": false,
    "info": "您还没有作答过本题目"
}
```

#### 35.4 返回参数

| 字段 | 类型       | 含义                                         |
| ---- | ---------- | -------------------------------------------- |
| info | int/string | 查询到则返回对应分数，查询不到返回提示字符串 |

### 36.添加口语课程分数 

#### 36.1 请求说明

> 请求方式：GET
> 请求URL ：/course/user/addOralCourseScore 

#### 36.2 请求参数

| 字段       | 类型   | 含义                               |
| ---------- | ------ | ---------------------------------- |
| userId     | int    | 用户Id(如果可以传cookie则可以不传) |
| courseType | string | 课程类型                           |
| courseId   | int    | 课程ID                             |
| oralScore  | int    | 口语分数                           |

#### 36.3 返回结果接收

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

#### 36.4 返回参数

过于简单，不作讲解

### 37.查看指定用户口语课程平均分数

#### 37.1 请求说明

> 请求方式：GET
> 请求URL ：/course/user/getAvgOralCourseScoreOfUser 

#### 37.2 请求参数

| 字段   | 类型 | 含义                               |
| ------ | ---- | ---------------------------------- |
| userId | int  | 用户Id(如果可以传cookie则可以不传) |

#### 37.3 返回结果接收

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

#### 37.4 返回参数

过于简单，不作讲解

### 38.查看指定用户签到的天数 

#### 38.1 请求说明

> 请求方式：GET
> 请求URL ：/user/user/getUserSignInRecording 

#### 38.2 请求参数

| 字段   | 类型 | 含义                               |
| ------ | ---- | ---------------------------------- |
| userId | int  | 用户Id(如果可以传cookie则可以不传) |

#### 38.3 返回结果接收

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

#### 38.4 返回参数

过于简单，不作讲解

### 39.用户提交签到请求

#### 39.1 请求说明

> 请求方式：GET
> 请求URL ：/user/user/addSignInRecording 

#### 39.2 请求参数

| 字段   | 类型 | 含义                               |
| ------ | ---- | ---------------------------------- |
| userId | int  | 用户Id(如果可以传cookie则可以不传) |

#### 39.3 返回结果接收

- 成功时返回内容(连续签到或不连续签到都算成功，不连续的话totalTime为1)

```json  
{
    "status": true,
    "info": {
        "signInId": 1,
        "userId": 3,
        "totalTimes": 1,
        "recentMark": "2018-09-02 02:01:59.0"
    }
}
```

- 失败时返回内容（当天重复签到提示错误）

```json
{
    "status": false,
    "info": "您今日已经签到，请明日再来"
}
```

#### 39.4 返回参数

过于简单，不作讲解

### 40.查看指定用户指定课程是否订阅 

#### 40.1 请求说明

> 请求方式：GET
> 请求URL ：/course/user/checkSubscriptionRecordingOfUser 

#### 40.2 请求参数

| 字段       | 类型   | 含义                               |
| ---------- | ------ | ---------------------------------- |
| userId     | int    | 用户Id(如果可以传cookie则可以不传) |
| courseType | string | 课程类型                           |
| courseId   | int    | 课程ID                             |

#### 40.3 返回结果接收

- 成功时返回内容

```json  
{
    "status": true,
    "info": "已订阅该课程"
}
```

- 失败时返回内容

```json
{
    "status": false,
    "info": "暂未订阅该课程"
}
```

#### 40.4 返回参数

过于简单，不作讲解

### 41.指定用户订阅指定课程 

#### 41.1 请求说明

> 请求方式：POST
> 请求URL ：/course/user/addSubscriptionRecording 

#### 41.2 请求参数

| 字段       | 类型   | 含义                               |
| ---------- | ------ | ---------------------------------- |
| userId     | int    | 用户Id(如果可以传cookie则可以不传) |
| courseType | string | 课程类型                           |
| courseId   | int    | 课程ID                             |

#### 41.3 返回结果接收

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

#### 41.4 返回参数

过于简单，不作讲解

### 42.指定用户删除订阅指定课程 

#### 42.1 请求说明

> 请求方式：GET
> 请求URL ：/course/user/deleteSubscriptionRecording 

#### 42.2 请求参数

| 字段                    | 类型 | 含义   |
| ----------------------- | ---- | ------ |
| subscriptionRecordingId | int  | 订阅id |

#### 42.3 返回结果接收

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

#### 42.4 返回参数

过于简单，不作讲解

### 43.查看指定用户订阅的所有课程（分页） 

#### 43.1 请求说明

> 请求方式：GET
> 请求URL ：/course/user/getSubscriptionRecordingOfUser/{pageNum} 
>
> pageNum为页号

#### 43.2 请求参数

| 字段   | 类型 | 含义                               |
| ------ | ---- | ---------------------------------- |
| userId | int  | 用户Id(如果可以传cookie则可以不传) |

#### 43.3 返回结果接收

- 成功时返回内容

```json  
{
    "status": true,
    "info": {
        "subscriptionRecordings": [
            {
                "subscriptionRecordingId": 1,
                "subscriptionTime": 1535835860000,
                "user": {
                    "userId": 2,
                    "userSex": "男",
                    "userName": "Daming",
                    "userPassword": "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92",
                    "userAvatarUrl": "/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/fcfb6747-5ef4-47fe-8e7e-ff1b4b6e05c615842685420Avatar.png",
                    "userPhoneNumber": "15842685420",
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
                }
            },
            {
                "subscriptionRecordingId": 3,
                "subscriptionTime": 1535835880000,
                "user": {
                    "userId": 2,
                    "userSex": "男",
                    "userName": "Daming",
                    "userPassword": "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92",
                    "userAvatarUrl": "/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/fcfb6747-5ef4-47fe-8e7e-ff1b4b6e05c615842685420Avatar.png",
                    "userPhoneNumber": "15842685420",
                    "userPermission": 0
                },
                "course": {
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
                    "courseChineseContent": "英文",
                    "courseEnglishContent": "English",
                    "courseResourceUrl": "/SSLearningTeam/ListeningCourseResource/e1f53648-64a0-4b7b-af59-4cee36b8149f学员网页端.mp3",
                    "downloadNum": 2,
                    "instructionImgUrl": "/SSLearningTeam/ListeningCourseResource/bed0730d-5012-4e17-8923-a2f952c63bcb英文.png"
                }
            },
            {
                "subscriptionRecordingId": 4,
                "subscriptionTime": 1535835957000,
                "user": {
                    "userId": 2,
                    "userSex": "男",
                    "userName": "Daming",
                    "userPassword": "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92",
                    "userAvatarUrl": "/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/fcfb6747-5ef4-47fe-8e7e-ff1b4b6e05c615842685420Avatar.png",
                    "userPhoneNumber": "15842685420",
                    "userPermission": 0
                },
                "course": {
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
                    "courseChineseContent": "听力",
                    "courseEnglishContent": "listening",
                    "courseResourceUrl": "/SSLearningTeam/ListeningCourseResource/521bc7f2-c9c5-41b6-96a5-fe6b2c7839f9学员网页端.mp3",
                    "downloadNum": 5,
                    "instructionImgUrl": "/SSLearningTeam/ListeningCourseResource/417c1422-94c0-4b2d-831e-22fc97bc7020中文.png"
                }
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
    "info": "用户没有订阅任何内容"
}
```

#### 43.4 返回参数

过于简单，不作讲解

### 44.查看指定课程订阅的所有用户（分页） 

#### 44.1 请求说明

> 请求方式：GET
> 请求URL ：/course/user/getSubscriptionRecordingOfCourse/{pageNum} 
>
> pageNum为页号

#### 44.2 请求参数

| 字段       | 类型   | 含义     |
| ---------- | ------ | -------- |
| courseType | string | 课程类型 |
| courseId   | int    | 课程Id   |

#### 44.3 返回结果接收

- 成功时返回内容

```json  
{
    "status": true,
    "info": {
        "subscriptionRecordings": [
            {
                "subscriptionRecordingId": 1,
                "subscriptionTime": 1535835860000,
                "user": {
                    "userId": 2,
                    "userSex": "男",
                    "userName": "Daming",
                    "userPassword": "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92",
                    "userAvatarUrl": "/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/fcfb6747-5ef4-47fe-8e7e-ff1b4b6e05c615842685420Avatar.png",
                    "userPhoneNumber": "15842685420",
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
                }
            },
            {
                "subscriptionRecordingId": 2,
                "subscriptionTime": 1535835873000,
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
                }
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
    "info": "课程没有被订阅记录"
}
```

#### 44.4 返回参数

过于简单，不作讲解

### 45.查看指定课程订阅的所有用户（分页） 

#### 45.1 请求说明

> 请求方式：GET
> 请求URL ：/course/user/getSubscriptionRecordingOfCourse/{pageNum} 
>
> pageNum为页号

#### 45.2 请求参数

| 字段       | 类型   | 含义     |
| ---------- | ------ | -------- |
| courseType | string | 课程类型 |
| courseId   | int    | 课程Id   |

#### 45.3 返回结果接收

- 成功时返回内容

```json  
{
    "status": true,
    "info": {
        "subscriptionRecordings": [
            {
                "subscriptionRecordingId": 1,
                "subscriptionTime": 1535835860000,
                "user": {
                    "userId": 2,
                    "userSex": "男",
                    "userName": "Daming",
                    "userPassword": "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92",
                    "userAvatarUrl": "/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/fcfb6747-5ef4-47fe-8e7e-ff1b4b6e05c615842685420Avatar.png",
                    "userPhoneNumber": "15842685420",
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
                }
            },
            {
                "subscriptionRecordingId": 2,
                "subscriptionTime": 1535835873000,
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
                }
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
    "info": "课程没有被订阅记录"
}
```

#### 45.4 返回参数

过于简单，不作讲解

### 46.用户查询模拟套题列表（分页） 

#### 46.1 请求说明

> 请求方式：GET
> 请求URL ：/train/user/simulatedtests_manage/{pageNum} 
>
> pageNum为页号

#### 46.2 请求参数

无

#### 46.3 返回结果接收

- 成功时返回内容

```json  
{
    "status": true,
    "info": {
        "simulatedTests": [
            {
                "simulatedTestId": 1,
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
                "testName": "测试中文二级能力1",
                "instructionImgUrl": "/SSLearningTeam/TrainRecourses/7db509c8-992d-4932-8173-966f54e8a607成功.png"
            },
            {
                "simulatedTestId": 2,
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
                "testName": "测试中文二级能力2",
                "instructionImgUrl": "/SSLearningTeam/TrainRecourses/cf72a4ef-8f62-49ba-a277-768400cb6e9e对号2.png"
            },
            {
                "simulatedTestId": 3,
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
                "testName": "测试中文二级能力3-3",
                "instructionImgUrl": "/SSLearningTeam/TrainRecourses/a5548511-9cb8-4382-9c49-99b9d4abed6b5-121204193R0.gif"
            },
            {
                "simulatedTestId": 4,
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
                "testName": "测试中文二级能力4",
                "instructionImgUrl": "/SSLearningTeam/TrainRecourses/ad610287-98aa-40d1-a1f6-1b8db33cc93b对号2 (1).png"
            }
        ],
        "totalPages": 1,
        "currentPage": 1
    }
}
```

- 失败时返回内容

```json
{
    "status": false,
    "info": "暂时没有模拟套题记录"
}
```

#### 46.4 返回参数

过于简单，不作讲解

### 47.用户查询模拟套题信息的详情(套题信息+所有题目信息) 

#### 47.1 请求说明

> 请求方式：GET
> 请求URL ：/train/user/getAllSimulatedTestById

#### 47.2 请求参数

| 字段            | 类型 | 含义       |
| --------------- | ---- | ---------- |
| simulatedTestId | int  | 模拟套题Id |

#### 47.3 返回结果接收

- 成功时返回内容

```json  
{
    "status": true,
    "info": {
        "questions": [
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
        ],
        "simulatedTest": {
            "simulatedTestId": 2,
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
            "testName": "测试中文二级能力2",
            "instructionImgUrl": "/SSLearningTeam/TrainRecourses/cf72a4ef-8f62-49ba-a277-768400cb6e9e对号2.png"
        }
    }
}
```

- 失败时返回内容

```json
//输入错误的模拟测试Id
{
    "status": false,
    "info": "模拟测试查询有误"
}
//模拟测试没有添加题目
{
    "status": false,
    "info": "该模拟试题暂未添加题目"
}
```

#### 47.4 返回参数

过于简单，不作讲解

### 48.添加指定用户指定模拟套题测试结果

### 	[判断之前有没有数据，没有则添加，有则修改] 

#### 48.1 请求说明

> 请求方式：GET
> 请求URL ：/train/user/addTestQuestionResult

#### 48.2 请求参数

| 字段            | 类型 | 含义                               |
| --------------- | ---- | ---------------------------------- |
| simulatedTestId | int  | 模拟套题Id                         |
| userId          | int  | 用户Id(如果可以传cookie则可以不传) |
| resultScore     | int  | 测试结果                           |

#### 48.3 返回结果接收

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

#### 48.4 返回参数

过于简单，不作讲解

### 49.用户查询指定用户指定模拟套题测试结果

#### 49.1 请求说明

> 请求方式：GET
> 请求URL ：/train/user/getTestQuestionResultOfUserOnSimulatedTest

#### 49.2 请求参数

| 字段            | 类型 | 含义                               |
| --------------- | ---- | ---------------------------------- |
| simulatedTestId | int  | 模拟套题Id                         |
| userId          | int  | 用户Id(如果可以传cookie则可以不传) |

#### 49.3 返回结果接收

- 成功时返回内容

```json  
{
    "status": true,
    "info": 100
}
```

- 失败时返回内容

```json
{
    "status": false,
    "info": "用户没有参与模拟测试"
}
```

#### 49.4 返回参数

成功时返回的info为具体分数值

### 50.查询指定用户所有模拟套题测试结果平均分

#### 50.1 请求说明

> 请求方式：GET
> 请求URL ：/train/user/getAvgTestQuestionResultOfUser

#### 50.2 请求参数

| 字段   | 类型 | 含义                               |
| ------ | ---- | ---------------------------------- |
| userId | int  | 用户Id(如果可以传cookie则可以不传) |

#### 50.3 返回结果接收

- 成功时返回内容

```json  
{
    "status": true,
    "info": 95
}
```

- 失败时返回内容

```json
{
    "status": false,
    "info": "用户没有模拟题测试结果"
}
```

#### 50.4 返回参数

成功时返回的info为平均分

### 51.移动端用户登录 

#### 51.1 请求说明

> 请求方式：GET
> 请求URL ：/user/mobile/login 

#### 51.2 请求参数

| 字段            | 类型   | 含义       |
| --------------- | ------ | ---------- |
| userPhoneNumber | int    | 用户手机号 |
| userPassword    | string | 用户密码   |

#### 51.3 返回结果接收

- 成功时返回内容

```json  
{
    "status": true,
    "info": {
        "userId": 2,
        "userSex": "男",
        "userName": "Daming",
        "userPassword": "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92",
        "userAvatarUrl": "/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/fcfb6747-5ef4-47fe-8e7e-ff1b4b6e05c615842685420Avatar.png",
        "userPhoneNumber": "15842685420",
        "userPermission": 0
    }
}
```

- 失败时返回内容

```json
{
    "status": false,
    "info": "您的用户名或密码有误,请重新输入!"
}
```

#### 51.4 返回参数

登陆成功返回info为用户对象

### 52.移动端用户注册

#### 52.1 请求说明

> 请求方式：GET
> 请求URL ：/user/mobile/register

#### 52.2 请求参数

| 字段            | 类型   | 含义       |
| --------------- | ------ | ---------- |
| userName        | string | 用户名     |
| userSex         | string | 用户性别   |
| userPhoneNumber | int    | 用户手机号 |
| chaphcha        | string | 验证码     |
| userPassword    | string | 用户密码   |
| userAvatar      | file   | 用户 头像  |

#### 52.3 返回结果接收

- 成功时返回内容

```json  
{
    "status": true,
    "info": "恭喜您，注册成功"
}
```

- 失败时返回内容

```json
{
    "status": false,
    "info": "遇到未知错误，请稍后再试!"
}
```

#### 52.4 返回参数

过于简单，不作讲解

### 53.查看指定用户个人信息

#### 53.1 请求说明

> 请求方式：GET
> 请求URL ：/user/user/getUserInfo

#### 53.2 请求参数

| 字段   | 类型 | 含义                               |
| ------ | ---- | ---------------------------------- |
| userId | int  | 用户Id(如果可以传cookie则可以不传) |

#### 53.3 返回结果接收

- 成功时返回内容

```json  
{
    "status": true,
    "info": {
        "userId": 3,
        "userSex": "女",
        "userName": "Amy",
        "userPassword": "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92",
        "userAvatarUrl": "/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/616b55f8-8df9-49ac-9247-a1bd1780391918041168030Avatar.png",
        "userPhoneNumber": "18041168030",
        "userPermission": 0
    }
}
```

- 失败时返回内容

```json
{
    "status": false,
    "info": "用户不存在"
}
```

#### 53.4 返回参数

过于简单，不作讲解

### 54.查看指定用户个人信息

#### 54.1 请求说明

> 请求方式：GET
> 请求URL ：/user/user/getUserInfo

#### 54.2 请求参数

| 字段   | 类型 | 含义                               |
| ------ | ---- | ---------------------------------- |
| userId | int  | 用户Id(如果可以传cookie则可以不传) |

#### 54.3 返回结果接收

- 成功时返回内容

```json  
{
    "status": true,
    "info": {
        "userId": 3,
        "userSex": "女",
        "userName": "Amy",
        "userPassword": "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92",
        "userAvatarUrl": "/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/616b55f8-8df9-49ac-9247-a1bd1780391918041168030Avatar.png",
        "userPhoneNumber": "18041168030",
        "userPermission": 0
    }
}
```

- 失败时返回内容

```json
{
    "status": false,
    "info": "用户不存在"
}
```

#### 54.4 返回参数

过于简单，不作讲解

### 55.修改用户个人信息

#### 55.1 请求说明

> 请求方式：GET
> 请求URL ：/user/user/updateUserInfo

#### 55.2 请求参数

| 字段            | 类型   | 含义                 |
| --------------- | ------ | -------------------- |
| userName        | string | 用户名               |
| userSex         | string | 用户性别             |
| userPhoneNumber | int    | 用户手机号           |
| chaphcha        | string | 验证码               |
| userPassword    | string | 用户密码             |
| userAvatar      | file   | 用户头像(可改可不改) |
| userId          | int    | 用户Id               |

#### 55.3 返回结果接收

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

#### 55.4 返回参数

过于简单，不作讲解

### 56.注销登录 

#### 56.1 请求说明

> 请求方式：GET
> 请求URL ：/user/user/quitLogin

#### 56.2 请求参数

无

#### 56.3 返回结果接收

- 成功时返回内容

```json  
{
    "status": true,
    "info": "注销成功"
}
```

- 失败时返回内容

```json
{
    "status": false,
    "info": "注销失败，您还没有登录"
}
```

#### 56.4 返回参数

过于简单，不作讲解

