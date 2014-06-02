 <ul id="sddm">
    <li><a href="home.go">Home</a></li>
    <li><a href="home.go" 
        onmouseover="mopen('m1')" 
        onmouseout="mclosetime()">Menu 1</a>
        <div id="m1" 
            onmouseover="mcancelclosetime()" 
            onmouseout="mclosetime()">
        <a href="home.go">Link 1</a>
        <a href="home.go">Link 2</a>
        </div>
    </li>
    <li><a href="home.go" 
        onmouseover="mopen('m2')" 
        onmouseout="mclosetime()">Menu 2</a>
        <div id="m2" 
            onmouseover="mcancelclosetime()" 
            onmouseout="mclosetime()">
        <a href="home.go">Link 1</a>
        <a href="home.go">Link 2</a>
        </div>
    </li>
    <li><a href="secure.go">Secure</a></li>
</ul>
<div style="clear:both"></div>