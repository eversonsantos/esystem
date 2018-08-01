import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { RouterModule, Routes } from "@angular/router";

import { FormComponent as FormRaca } from "./../raca/form/form.component";
import { ListComponent as ListRaca } from "./../raca/list/list.component";
import { ListComponent as ListMembro } from "./../membro/list/list.component";
import { FormComponent as FormMembro } from "./../membro/form/form.component";

const appRoutes: Routes = [
  { path: "membros", component: ListMembro },
  { path: "membro", component: FormMembro },
  { path: "racas", component: ListRaca },
  { path: "raca", component: FormRaca }
];

@NgModule({
  imports: [CommonModule, RouterModule.forRoot(appRoutes)],
  declarations: [],
  exports: [RouterModule]
})
export class AppRouterModule {}
