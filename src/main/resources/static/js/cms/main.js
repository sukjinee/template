require.config({
  baseUrl: '/js',
  paths: {
    'jquery': '//cdnjs.cloudflare.com/ajax/libs/jquery/2.1.4/jquery',
    'bootstrap': '//netdna.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap',
    'summernote': '//cdnjs.cloudflare.com/ajax/libs/summernote/0.8.6/summernote'
  },

  shim : {
	'jquery': {
		exports: '$'
    },
    'bootstrap': ['jquery'],
    'summernote': ['bootstrap']
  }
});
// 초기화 시작
require(['jquery', 'summernote'], function ($) {

	$('#editor').summernote();
});