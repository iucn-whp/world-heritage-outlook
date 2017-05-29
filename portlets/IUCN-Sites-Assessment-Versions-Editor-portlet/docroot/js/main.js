var Assessments = function (config) {

    this.container = $(config.container);

    this.namespace = config.namespace;

    this.urls = config.urls;

    this.initialize(this);

};

$.extend(Assessments, true, {

    prototype: {

        initialize: function (scope) {

            scope.container.on('click', '.assessment-tab', {scope: scope}, scope.goToNextTab);
        },

        goToNextTab: function (e) {
            e.preventDefault();

            var _scope = e.data.scope,
                $tab = $(this);

            _scope.showTabContent($tab.attr("id"));
        },

        /*============ Utils ==========*/
        _sendAjax: function (url, data) {
            return jQuery.ajax({
                url: url,
                type: 'POST',
                dataType: "json",
                cache: false,
                //async: false,
                data: data
            });
        },

        showTabContent: function (step) {
            $('#docsContent1').children().addClass('aui-helper-hidden');
            $("div [data-step='" + step + "']").removeClass('aui-helper-hidden');
        }

    }

});

window.Assessments = Assessments;