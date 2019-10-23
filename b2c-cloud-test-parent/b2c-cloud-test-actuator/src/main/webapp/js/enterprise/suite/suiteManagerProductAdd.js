nui.parse();

var searchProductCondiForm = new nui.Form("searchProductCondiForm");
var productDatagrid = nui.get("productDatagrid");

searchProducts();

function searchProducts() {
    var data = searchProductCondiForm.getData(true, true);
    productDatagrid.load(data);
}

var dataReturn = {};

function selectProducts() {
    var rows = productDatagrid.getSelecteds();
    if (rows.length === 0) {
        nui.alert("请至少选择一条记录", Bluemoon.CONSTANT.WARM_TIP);
        return;
    }
    dataReturn = rows;
    Bluemoon.closeWindow("confirm");
}

function getData() {
    return dataReturn;
}

function reset() {
    searchProductCondiForm.reset();
}