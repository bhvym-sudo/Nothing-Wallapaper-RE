.class public final synthetic Ly7/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Ly7/S;

.field public final synthetic r:I

.field public final synthetic s:LF2/t;

.field public final synthetic t:Lcom/nothing/cardhost/g;


# direct methods
.method public synthetic constructor <init>(Ly7/S;ILF2/t;Lcom/nothing/cardhost/g;)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly7/G;->q:Ly7/S;

    iput p2, p0, Ly7/G;->r:I

    iput-object p3, p0, Ly7/G;->s:LF2/t;

    iput-object p4, p0, Ly7/G;->t:Lcom/nothing/cardhost/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    iget-object v0, p0, Ly7/G;->q:Ly7/S;

    iget v1, p0, Ly7/G;->r:I

    iget-object v2, p0, Ly7/G;->s:LF2/t;

    iget-object p0, p0, Ly7/G;->t:Lcom/nothing/cardhost/g;

    invoke-static {v0, v1, v2, p0}, Ly7/S;->k0(Ly7/S;ILF2/t;Lcom/nothing/cardhost/g;)V

    return-void
.end method
