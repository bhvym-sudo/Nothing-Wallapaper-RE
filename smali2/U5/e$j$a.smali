.class public final LU5/e$j$a;
.super Landroid/database/ContentObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU5/e$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LU5/e;

.field final synthetic b:LH8/t;


# direct methods
.method constructor <init>(LU5/e;LH8/t;)V
    .registers 3

    iput-object p1, p0, LU5/e$j$a;->a:LU5/e;

    iput-object p2, p0, LU5/e$j$a;->b:LH8/t;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public onChange(Z)V
    .registers 2

    iget-object p1, p0, LU5/e$j$a;->a:LU5/e;

    iget-object p0, p0, LU5/e$j$a;->b:LH8/t;

    invoke-static {p1, p0}, LU5/e$j;->u(LU5/e;LH8/t;)V

    return-void
.end method
