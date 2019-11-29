var myChart = echarts.init(document.getElementById('main'));
option = {
    title: {
        text: '车流量统计',
        x: 'center',
        y: -5
    },
    xAxis: {
        name: '时间',    // 轴名称
        type: 'category',
        data: ["2019/11/25 00:00:00", "2019/11/25 03:00:00", "2019/11/25 06:00:00", "2019/11/25 09:00:00",
            "2019/11/25 12:00:00", "2019/11/25 15:00:00", "2019/11/25 18:00:00", "2019/11/25 21:00:00", "2019/11/25 24:00:00"]
    },
    yAxis: {
        name: '趟次',
        type: 'value'
    },
    grid: {
        top: '17%',
        left: '2%',
        right: '5%',
        bottom: '10%',
        containLabel: true
    },
    series: [{
        data: [0, 0, 25, 62, 73, 65, 68, 70, 47],
        type: 'line'
    }]
};
myChart.setOption(option);