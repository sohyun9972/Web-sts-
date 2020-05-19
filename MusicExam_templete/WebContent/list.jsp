<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>강좌목록</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/style.css" rel="stylesheet">
<style type="text/css">
body {
	padding: 50px;
}
h1 {
	font-weight:bold;
	color : #A0B0DB;
}
.ranking {
	text-align: center;
	font-size: 28pt;
}

.spanTitle {
	font-size: 18pt;
	font-weight: bold;
	margin-right: 10px;
}

.pAlbum {
	color: gray;
	margin-left: 5px;
}

.imgAlbum {
	width: 80px;
	height: 80px;
	margin-right: 10px;
}

.btnPlay {
	margin-top:40%
}
</style>
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<h1>Music Chart</h1>
				<div align="right">
				<form action="list.html" method="post">
				<input type="text" placeholder="곡명을 입력하세요."> <input class="btn btn-xs btn-default" type="submit" value="검색">
				</form>
				</div>
				<table class="table table-hover table-condensed">
					<colgroup>
						<col width="80" align="center">
						<col width="*">
						<col width="70">
					</colgroup>
					<thead>
						<tr>
							<th>순위</th>
							<th>곡정보/곡명</th>
							<th>담기</th>
						</tr>
					</thead>
					<tbody>
                        <tr>
                            <td class="ranking">1</td>
                            <td>
                            <table>
                            <tr><td rowspan="2"><img class="imgAlbum" src="resources/img/album_1.JPG" ></td>
                            <td><span class="spanTitle">You Are My Everything</span><a class="btn btn-xs btn-default" href="detail.html"><b>i</b></a></td>
                            </tr>
                            <tr><td><p class="pAlbum">거미 - 태양의 후예 OST Part 4</p></td></tr>
                            </table>
                            <td><a class="btn btn-xs btn-info btnPlay" href="myList.html">담기</a></td>
                        </tr>
                        <tr>
                            <td class="ranking">2</td>
                            <td>
                            <table>
                            <tr><td rowspan="2"><img class="imgAlbum" src="resources/img/album_2.JPG" ></td>
                            <td><span class="spanTitle">이 사랑</span><a class="btn btn-xs btn-default" href="detail.html"><b>i</b></a></td>
                            </tr>
                            <tr><td><p class="pAlbum">다비치 - 태양의 후예 OST Part3</p></td></tr>
                            </table>
                            <td><a class="btn btn-xs btn-info btnPlay" href="myList.html">담기</a></td>
                        </tr>
                        <tr>
                            <td class="ranking">3</td>
                            <td>
                            <table>
                            <tr><td rowspan="2"><img class="imgAlbum" src="resources/img/album_3.JPG" ></td>
                            <td><span class="spanTitle">ALWAYS</span><a class="btn btn-xs btn-default" href="detail.html"><b>i</b></a></td>
                            </tr>
                            <tr><td><p class="pAlbum">윤미래 - 태양의 후예 OST Part 1</p></td></tr>
                            </table>
                            <td><a class="btn btn-xs btn-info btnPlay" href="myList.html">담기</a></td>
                        </tr>
                        <tr>
                            <td class="ranking">4</td>
                            <td>
                            <table>
                            <tr><td rowspan="2"><img class="imgAlbum" src="resources/img/album_4.JPG" ></td>
                            <td><span class="spanTitle">넌 is 뭔들</span><a class="btn btn-xs btn-default" href="detail.html"><b>i</b></a></td>
                            </tr>
                            <tr><td><p class="pAlbum">마마무(Mamamoo) - Melting</p></td></tr>
                            </table>
                            <td><a class="btn btn-xs btn-info btnPlay" href="myList.html">담기</a></td>
                        </tr>
                        <tr>
                            <td class="ranking">5</td>
                            <td>
                            <table>
                            <tr><td rowspan="2"><img class="imgAlbum" src="resources/img/album_11.JPG" ></td>
                            <td><span class="spanTitle">사랑이 온다</span><a class="btn btn-xs btn-default" href="detail.html"><b>i</b></a></td>
                            </tr>
                            <tr><td><p class="pAlbum">백지영- Girl Crush</p></td></tr>
                            </table>
                            <td><a class="btn btn-xs btn-info btnPlay" href="myList.html">담기</a></td>
                        </tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>