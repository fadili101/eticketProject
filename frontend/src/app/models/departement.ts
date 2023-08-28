import { User } from "./user";

export interface Departement {
    departementId: number;
    nom: string;
    type: string;
    parent: Departement | null;
    children: Departement[];
    userSet: User[];
}