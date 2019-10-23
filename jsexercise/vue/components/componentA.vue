<template>
    <p>{{ title }}</p>
</template>
<script>
    export default {
        name: 'component-a',
        props: {
            title: {
                type: String,
                default: function () {
                    return "标题";
                }
            }
        }
    }
</script>
