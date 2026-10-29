.class public final synthetic LU5/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:LU5/e;

.field public final synthetic r:LU5/e$C$a;


# direct methods
.method public synthetic constructor <init>(LU5/e;LU5/e$C$a;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU5/h;->q:LU5/e;

    iput-object p2, p0, LU5/h;->r:LU5/e$C$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 2

    iget-object v0, p0, LU5/h;->q:LU5/e;

    iget-object p0, p0, LU5/h;->r:LU5/e$C$a;

    invoke-static {v0, p0}, LU5/e$C;->s(LU5/e;LU5/e$C$a;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
