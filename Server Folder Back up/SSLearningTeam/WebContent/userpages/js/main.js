

function byId(id) {
    return document.getElementById(id);
}
function byClass (cl) {
    return document.getElementsByClassName(cl);
}
let first = "http://localhost:8080/SSLearningTeam";
function GetRequest() {
    var url = location.search; //获取url中"?"符后的字串   
    var theRequest = new Object();   
    if (url.indexOf("?") != -1) {   
        var str = url.substr(1);   
        strs = str.split("&");   
        for(var i = 0; i < strs.length; i ++) {   
            theRequest[strs[i].split("=")[0]]=unescape(strs[i].split("=")[1]);   
        }   
    }   
    return theRequest;   
}

function courseListen(r,y) {
    $('#course-box').append(
        '<div class="course-box">'+
            '<a courseId="'+r.info.courses.listeningCourses[y].courseId+'" target="_blank" href="./courseListen.html?courseId='+r.info.courses.listeningCourses[y].courseId+'">'+
                '<div class="course-img-box">'+
                    '<img class="course-img" src="'+r.info.courses.listeningCourses[y].instructionImgUrl+'" alt="課程">'+
                '</div>'+
                '<div class="course-content">'+
                    '<h3 class="content-title">'+r.info.courses.listeningCourses[y].courseName+'</h3>'+
                    '<div class="content-detail">'+
                        '<div class="course-type">'+
                            '<p class="classify-course-state">'+r.info.courses.listeningCourses[y].courseChineseContent+'</p>'+
                        '</div>'+
                        '<div class="course-rate">'+
                            '<span class="rate-star">'+
                                '热度：'+r.info.courses.listeningCourses[y].downloadNum+
                            '</span>'+
                        '</div>'+
                    '</div>'+
                '</div>'+
            '</a>'+
        '</div>')
}

function courseSpeak(r,y) {
    $('#course-box').append(
        '<div class="course-box">'+
            '<a courseId="'+r.info.courses.oralCourses[y].courseId+'" target="_blank" href="./courseSpeak.html?courseId='+r.info.courses.oralCourses[y].courseId+'">'+
                '<div class="course-img-box">'+
                    '<img class="course-img" src="'+r.info.courses.oralCourses[y].instructionImgUrl+'" alt="課程">'+
                '</div>'+
                '<div class="course-content">'+
                    '<h3 class="content-title">'+r.info.courses.oralCourses[y].courseName+'</h3>'+
                    '<div class="content-detail">'+
                        '<div class="course-type">'+
                            '<p class="classify-course-state">'+r.info.courses.oralCourses[y].courseChineseContent+'</p>'+
                        '</div>'+
                        '<div class="course-rate">'+
                            '<span class="rate-star">'+
                                '热度：'+r.info.courses.oralCourses[y].downloadNum+
                            '</span>'+
                        '</div>'+
                    '</div>'+
                '</div>'+
            '</a>'+
        '</div>')
}

function courseRead(r,y) {
    $('#course-box').append(
        '<div class="course-box">'+
            '<a courseId="'+r.info.courses.readingCourses[y].courseId+'" target="_blank" href="./courseRead.html?courseId='+r.info.courses.readingCourses[y].courseId+'">'+
                '<div class="course-img-box">'+
                    '<img class="course-img" src="'+r.info.courses.readingCourses[y].instructionImgUrl+'" alt="課程">'+
                '</div>'+
                '<div class="course-content">'+
                    '<h3 class="content-title">'+r.info.courses.readingCourses[y].courseName+'</h3>'+
                    '<div class="content-detail">'+
                        '<div class="course-type">'+
                            '<p class="classify-course-state">'+r.info.courses.readingCourses[y].courseChineseContent+'</p>'+
                        '</div>'+
                        '<div class="course-rate">'+
                            '<span class="rate-star">'+
                                '热度：'+r.info.courses.readingCourses[y].downloadNum+
                            '</span>'+
                        '</div>'+
                    '</div>'+
                '</div>'+
            '</a>'+
        '</div>')
}