function submit(b,a){$("#safeform").attr("action",b);var c=0;$.each(a,function(d,e){$("#safeform input").eq(c).attr("name",d).val(e);c=c+1});$("#safeform").submit()}function check(a){if(a.val()==""){a.focus();return false}return true}function picload(a){if(a.width()>300){a.css("width","300px")}if(a.height()>150){a.css("height","150px")}a.parent().css("height",(a.height()+40)+"px")}function getY(a){a=a||window.event;return a.pageY||a.clientY+document.documentElement.scrollTop}function checkPic(){if($("input[name='link']").val()==""){alert("图片link不能为空");$("input[name='link']").focus();return false}if($("input[name='path']").val()==""){alert("图片path不能为空");$("input[name='path']").focus();return false}return true}function checkForm(){if($("input[name='name']").length>0&&($("input[name='name']").val()==""||$("input[name='name']").val().length>15)){alert("名称字数范围为1-15");$("input[name='name']").focus();return false}if($("input[name='title']").length>0&&($("input[name='title']").val()==""||$("input[name='title']").val().length>50)){alert("标题字数范围为1-50");$("input[name='title']").focus();return false}if($("input[name='face']").length>0&&$("input[name='face']").val()==""){alert("请上传图片");$("input[name='face']").focus();return false}if($("input[name='pic']").length>0&&$("input[name='pic']").val()==""){alert("请上传图片");$("input[name='pic']").focus();return false}if($("input[name='download']").length>0&&$("input[name='download']").val()==""){alert("请上传附件");$("input[name='download']").focus();return false}if($("textarea[name='info']").length>0&&($("textarea[name='info']").val()==""||$("textarea[name='info']").val().length>200||$("textarea[name='info']").val().length<10)){alert("确保摘要字数范围在10-200之内");$("textarea[name='info']").focus();return false}if($("textarea[name='content']").length>0&&$("textarea[name='content']").val()==""){alert("内容不能为空");$("textarea[name='content']").focus();return false}return true}function change2active(a){a.removeClass("nav_li").addClass("nav_li_active");a.find("a:first").removeClass("nav_a").addClass("nav_a_active")}function change2normal(a){if("undefined"==typeof nav_active||a.index()!=nav_active){a.removeClass("nav_li_active").addClass("nav_li");a.find("a:first").removeClass("nav_a_active").addClass("nav_a")}}jQuery(document).ready(function(){$(".nav_li").mouseenter(function(){change2active($(this))});$(".nav_li").mouseleave(function(a){change2normal($(this))})});
