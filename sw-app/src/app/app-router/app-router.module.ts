import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { RouterModule, Routes } from "@angular/router";

import { FormComponent as FormRaca } from "./../raca/form/form.component";
import { ListComponent as ListRaca } from "./../raca/list/list.component";

import { FormComponent as FormMembro } from "./../membro/form/form.component";
import { ListComponent as ListMembro } from "./../membro/list/list.component";

import { FormComponent as FormClasse} from './../classe/form/form.component';
import { ListComponent as ListClasse} from './../classe/list/list.component';

import { FormComponent as FormSpec } from './../espec/form/form.component';
import { ListComponent as ListSpec } from './../espec/list/list.component';

import { HomeComponent } from './../home/home.component';


const appRoutes: Routes = [
  { path: "membros", component: ListMembro },
  { path: "membro", component: FormMembro },
  { path: "racas", component: ListRaca },
  { path: "raca", component: FormRaca },
  { path: "classes", component: ListClasse },
  { path: "classe", component: FormClasse },
  { path: "specs", component: ListSpec },
  { path: "spec", component: FormSpec },
  {path : "**", component: HomeComponent}
];

@NgModule({
  imports: [CommonModule, RouterModule.forRoot(appRoutes)],
  declarations: [],
  exports: [RouterModule]
})
export class AppRouterModule {}
