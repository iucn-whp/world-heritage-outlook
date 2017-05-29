$(document).ready(function () {
    var images = document.body.getElementsByTagName('img');

    for (var i = 0; i < images.length; i++) {

        if (images[i].src.slice(-2) === '/' || images[i].src === "") {
            images[i].style.display = "none";
        }

        images[i].onerror = function () {
            this.style.display = "none";
        };
    }

});
