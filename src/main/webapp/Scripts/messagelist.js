var pageIndex = 1; //页索引 
var where = " where 1=1";
// 页脚属性设置 
function bindPager() {
    //填充分布控件信息 
    var pageCount = parseInt($("#lblPageCount").text()); //总页数 
    if (pageCount == 0) {
        document.getElementById("lblCurent").innerHTML = "0";
    }
    else {
        if (pageIndex > pageCount) {
            $("#lblCurent").text(1);
        }
        else {
            $("#lblCurent").text(pageIndex); //当前页 
        }
    }
    document.getElementById("first").disabled = (pageIndex == 1 || $("#lblCurent").text() == "0") ? true : false;
    document.getElementById("previous").disabled = (pageIndex <= 1 || $("#lblCurent").text() == "0") ? true : false;
    document.getElementById("next").disabled = (pageIndex >= pageCount) ? true : false;
    document.getElementById("last").disabled = (pageIndex == pageCount || $("#lblCurent").text() == "0") ? true : false;
}


//AJAX方法取得总页数 
function GetPageCount() {
    $.ajax({
        type: "post",
        dataType: "html",
        url: "/countPage.do",
        data: { "wherePageCount": where }, //"wherePageCount" + where,个人建议不用这种方式 
        async: false,
        success: function (msg) {
            document.getElementById("lblPageCount").innerHTML = msg;
        }
    });
}

//AJAX方法取得记录总数
function GetTotalCount() {
    $.ajax({
        type: "post",
        dataType: "html",
        url: "getCount.aspx",
        data: { "whereCount": where },
        async: false,
        success: function (msg) {
            document.getElementById("lblToatl").innerHTML = msg;
        }
    });
}

function content(pages) {
    $.ajax({
        url: '/seleAll.do',
        type: 'post',
        data: { page: pages },
        dataType: 'html',
        error: function () { alert('出现未知错误'); },
        success: function (data) {
            $("#content").html(data);
        }
    });

    $("#lblCurent").text(pageIndex);
    $(function () {
        GetTotalCount();
        GetPageCount();
        bindPager();
    });
}

function add() {
    $.ajax({
        url: '/addMsg.do',
        type: 'post',
        data: { title: $("#title").val(), contents:escape($(document.getElementsByTagName("iframe")[0].contentWindow.document.body).html()), muser: $("#muser").val() },
        dataType: 'html',
        error: function () { alert('出现未知错误'); },
        success: function (data) {
            if (data == "ok") {
                alert('添加成功！');
                content(1);
                $("#title").val("");
                $(document.getElementsByTagName("iframe")[0].contentWindow.document.body).html("");
                $("#muser").val("");
            }
            if (data == "erro") { alert('添加失败'); content(1); }
        }
    });

}



content(1);
$(document).ready(function () {
    //第一页按钮click事件
    $("#first").click(function () {
        pageIndex = 1;
        $("#lblCurent").text(1);
        content(pageIndex);
    });
    //上一页按钮click事件 
    $("#previous").click(function () {
        if (pageIndex != 1) {
            pageIndex--;
            $("#lblCurent").text(pageIndex);
        }
        content(pageIndex);
    });

    //下一页按钮click事件 
    $("#next").click(function () {
        var pageCount = parseInt($("#lblPageCount").text());
        if (pageIndex != pageCount) {
            pageIndex++;
            $("#lblCurent").text(pageIndex);
        }
        content(pageIndex);
    });

    //最后一页按钮click事件 
    $("#last").click(function () {
        var pageCount = parseInt($("#lblPageCount").text());
        pageIndex = pageCount;
        content(pageIndex);
    });
});
