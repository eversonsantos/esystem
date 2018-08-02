import { AppRouterModule } from "./app-router/app-router.module";
import { BrowserAnimationsModule } from "@angular/platform-browser/animations";
import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";
import { FormsModule } from "@angular/forms";

import { AppComponent } from "./app.component";
import { FormComponent as FormRaca } from "./raca/form/form.component";
import { ListComponent as ListRaca } from "./raca/list/list.component";

import { FormComponent as FormMembro } from "./membro/form/form.component";
import { ListComponent as ListMembro } from "./membro/list/list.component";

import { FormComponent as FormClasse} from './classe/form/form.component';
import { ListComponent as ListClasse} from './classe/list/list.component';

import { FormComponent as FormSpec } from './espec/form/form.component';
import { ListComponent as ListSpec } from './espec/list/list.component';

import { MatTableModule } from "@angular/material/table";
import { MatPaginatorModule } from "@angular/material/paginator";
import { HeaderComponent } from "./header/header.component";
import { MenuComponent } from "./menu/menu.component";
import { FooterComponent } from "./footer/footer.component";
import { HomeComponent } from './home/home.component';
import { FormComponent } from './espec/form/form.component';
import { ListComponent } from './espec/list/list.component';




@NgModule({
  declarations: [
    AppComponent,
    FormMembro,
    ListMembro,
    FormRaca,
    ListRaca,
    FormClasse,
    ListClasse,
    HeaderComponent,
    MenuComponent,
    FooterComponent,
    HomeComponent,
    ListSpec,
    FormSpec,
    FormComponent,
    ListComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    FormsModule,
    MatTableModule,
    MatPaginatorModule,
    AppRouterModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}
