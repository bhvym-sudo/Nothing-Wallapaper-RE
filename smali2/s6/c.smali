.class public final synthetic Ls6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:Z

.field public final synthetic r:Lg3/k;

.field public final synthetic s:Ls6/h;


# direct methods
.method public synthetic constructor <init>(ZLg3/k;Ls6/h;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ls6/c;->q:Z

    iput-object p2, p0, Ls6/c;->r:Lg3/k;

    iput-object p3, p0, Ls6/c;->s:Ls6/h;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 3

    iget-boolean v0, p0, Ls6/c;->q:Z

    iget-object v1, p0, Ls6/c;->r:Lg3/k;

    iget-object p0, p0, Ls6/c;->s:Ls6/h;

    invoke-static {v0, v1, p0}, Ls6/h;->e(ZLg3/k;Ls6/h;)Ls6/p;

    move-result-object p0

    return-object p0
.end method
