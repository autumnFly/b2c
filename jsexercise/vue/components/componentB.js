import {componentA} from "componentA";

export var componentB = {
    name: 'component-b',
    components: {
        'component-a': componentA
    },
    props: ['words'],
    template: '<component-a title="这是标题"></component-a>' +
        '<span>{{ words }} {{ words }}</span>'
};
