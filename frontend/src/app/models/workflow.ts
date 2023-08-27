import { Profil } from "./profil";

export interface Workflow {
    workFlowId: number;
    nom: string;
    parent: Workflow | null;
    children: Workflow[];
    profilSet: Profil[];
}
