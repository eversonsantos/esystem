import { Espec } from './espec';
import { Raca } from './raca';
export class Classe {

    private _id : number;
    private _nome : string;
    private _especs : Array<Espec>;
    private _raca : Raca;

    public getId () : number {
        return this._id;
    }

    public setId (id : number) : void {
        this._id = id;
    }

    public getNome () : string {
        return this._nome;
    }

    public setNome (nome : string) : void {
        this._nome = nome;
    }

    public getEspecs () : Array<Espec> {
        return this._especs;
    }

    public setEspecs (especs : Array<Espec>) : void {
        this._especs = especs;
    }

    public getRaca () : Raca {
        return this._raca;
    }

    public setRaca (raca : Raca) : void {
        this._raca = raca;
    }

}
