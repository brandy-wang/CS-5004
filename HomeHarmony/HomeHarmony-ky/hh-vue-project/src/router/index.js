import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    redirect: '/chores'
  },
  {
    path: '/chores',
    name: 'chores',
    component: () => import('../views/homeharmony/ChoreView.vue')
  }
]

const router = new VueRouter({
  routes
})

export default router
