	<script>
		$(function(){
			$('#slides').slides({
				preload: true,
				preloadImage: 'img/loading.gif',
				play: 5000,
				pause: 2500,
				hoverPause: true,
				animationStart: function(current){
					$('.caption').animate({
						bottom:-35
					},100);
					if (window.console && console.log) {
						// example return of current slide number
						console.log('animationStart on slide: ', current);
					};
				},
				animationComplete: function(current){
					$('.caption').animate({
						bottom:0
					},200);
					if (window.console && console.log) {
						// example return of current slide number
						console.log('animationComplete on slide: ', current);
					};
				},
				slidesLoaded: function() {
					$('.caption').animate({
						bottom:0
					},200);
				}
			});
		});
	$(document).ready(function(){
		$('.employee').css("background", "url('images/tab_selected_bg.png')");
		$('.jobSeeker').click(function(){
			$('.registerNow').css('display','block');
			$(this).css("background", "url('images/tab_selected_bg.png')");
			$('.employee').css("background", "url('images/tab_bg.png')");
		});

		$('.employee').focus(function(){
			$('.registerNow').css('display','none');
			$(this).css("background", "url('images/tab_selected_bg.png')");
			$('.jobSeeker').css("background", "url('images/tab_bg.png')");
		});
		$('.caption').css('opacity','0.4');
	});
</script>
