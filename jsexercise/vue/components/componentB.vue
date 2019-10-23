<template>
    <component-a title="这是标题"></component-a>
    <span>{{ words }} {{ words }}</span>
</template>

<script>
    import componentA from './componentA';
    export default {
        components: {
            componentA
        },
        name: 'component-b',
        props: {
            words: {
                type: String,
                default: function () {
                    return "a word";
                }
            }
        }
    }
</script>
