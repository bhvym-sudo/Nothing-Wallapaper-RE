.class public final synthetic LU5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# instance fields
.field public final synthetic q:LU5/e;

.field public final synthetic r:I


# direct methods
.method public synthetic constructor <init>(LU5/e;I)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU5/b;->q:LU5/e;

    iput p2, p0, LU5/b;->r:I

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iget-object v0, p0, LU5/b;->q:LU5/e;

    iget p0, p0, LU5/b;->r:I

    check-cast p1, LF5/m;

    invoke-static {v0, p0, p1}, LU5/e;->C(LU5/e;ILF5/m;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method
