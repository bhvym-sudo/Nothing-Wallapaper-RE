.class public final synthetic Ly7/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:Ly7/g;

.field public final synthetic r:Ly7/g$i$a;


# direct methods
.method public synthetic constructor <init>(Ly7/g;Ly7/g$i$a;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly7/k;->q:Ly7/g;

    iput-object p2, p0, Ly7/k;->r:Ly7/g$i$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 2

    iget-object v0, p0, Ly7/k;->q:Ly7/g;

    iget-object p0, p0, Ly7/k;->r:Ly7/g$i$a;

    invoke-static {v0, p0}, Ly7/g$i;->s(Ly7/g;Ly7/g$i$a;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
