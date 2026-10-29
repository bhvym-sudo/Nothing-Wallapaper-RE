.class public final synthetic Lr7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:Lv8/a;

.field public final synthetic r:Lr7/c;


# direct methods
.method public synthetic constructor <init>(Lv8/a;Lr7/c;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr7/b;->q:Lv8/a;

    iput-object p2, p0, Lr7/b;->r:Lr7/c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 2

    iget-object v0, p0, Lr7/b;->q:Lv8/a;

    iget-object p0, p0, Lr7/b;->r:Lr7/c;

    invoke-static {v0, p0}, Lr7/c;->F(Lv8/a;Lr7/c;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
