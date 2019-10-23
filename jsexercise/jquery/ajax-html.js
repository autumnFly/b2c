// 为以后要用到的Ajax请求设置默认的值
$.ajaxSetup({
    global: true
})
// 在每个请求之前被调用
$.ajaxPrefilter((options, originalOptions, jqXHR) => {
    console.log('ajaxPrefilter', options, originalOptions, jqXHR)
});
// AjaxAjax请求发送之前调用
$(document).ajaxSend((event, xhr, ajaxOptions) => {
    console.log('ajaxSend', event, xhr, ajaxOptions)
})
// Ajax请求完成时调用
$(document).ajaxComplete((event, xhr, ajaxOptions) => {
    console.log('ajaxComplete', event, xhr, ajaxOptions)
})
// Ajax请求成功时调用
$(document).ajaxSuccess((event, xhr, ajaxOptions) => {
    console.log('ajaxSuccess', event, xhr, ajaxOptions)
})
// Ajax请求出错时调用
$(document).ajaxError((event, xhr, ajaxOptions, error) => {
    console.error('ajaxError', event, xhr, ajaxOptions, error)
})
$.extend({
    postForObject: (reqUrl, reqJsonObj = {}, contentType = 'json') => {
        let reqStr;
        if (contentType == 'json') {
            reqStr = JSON.stringify(reqJsonObj);
            contentType = 'application/json'
        } else if (contentType == 'form') {
            reqStr = $.param(reqJsonObj);
            contentType = 'application/x-www-form-urlencoded'
        } else {
            throw new Error('contentType只能是json(默认)或者是form(表单格式)');
        }
        return new Promise(function (resolve, reject) {
            $.ajax({
                url: reqUrl,
                type: 'POST',
                data: reqStr,
                contentType: contentType,
                dataType: 'json',
                success: function (data, textStatus, jqXHR) {
                    resolve(data, textStatus, jqXHR)
                },
                error: function (jqXHR, textStatus, errorMsg) {
                    reject(jqXHR, textStatus, errorMsg)
                }
            });
        })
    }
});
$.postForObject('http://localhost:8520/greeting', {name: 'liangyudong', company: 'bluemoon'})
    .then((data) => {
        console.log('success:', data)
    })
    .catch((jqXHR) => {
        console.error('error:', jqXHR)
    })
    .finally(() => {
        console.log('end')
    })

