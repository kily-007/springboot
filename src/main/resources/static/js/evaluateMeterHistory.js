var myChart = echarts.init(document.getElementById('main'));
// 绘制图表
myChart.setOption({
    toolbox: {
        show: true,
        feature: {
            dataView: {
                iconStyle: {
                    normal: {
                        borderColor: '#f00'
                    }
                },
                readOnly: true,
                optionToContent: function(opt) {
                    var axisData = opt.xAxis[0].data;
                    var series = opt.series;
                    var table =
                        '<table id="test" class="table-bordered table-striped" style="width:100%;text-align:center" border="1" cellspacing="0" cellpadding="0">';
                    table += '<thead><tr>' + '<td>监测区</td>' + '<td>' + series[0].name + '</td>' + '</tr></thead><tbody>';
                    for (var i = 0, l = axisData.length; i < l; i++) {
                        table += '<tr><td>' + axisData[i] + '</td><td>' + series[0].data[i] + '</td></tr>';
                    }
                    table += '</tbody>';
                }
            },
            magicType: {
                show: true,
                type: ['bar'],
                iconStyle: {
                    normal: {
                        // color:'yellow',//设置颜色
                        borderColor: '#ffd306',
                    }
                }
            },
            restore: {
                show: true,
                iconStyle: {
                    normal: {
                        borderColor: '#0ff' // 设置颜色
                    }
                },
            },
            saveAsImage: {
                show: true,
                title: '保存为图片',
                iconStyle: {
                    normal: {
                        borderColor: '#0f0',
                    }
                }
            }
        }
    },
    tooltip: {},
    xAxis: {
        name: '时间',
        type: 'category',
        data: ['20191111', '20191109', '20191104', '20191001', '20191015', '20191001', '20190929']
    },
    yAxis: {
        name: '灵敏度',
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
        name: '灵敏度',
        data: [0.80,0.85,0.90,0.51,0.78,0.80,0.85],
        type: 'line'
    }]
});