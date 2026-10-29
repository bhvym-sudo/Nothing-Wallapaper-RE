.class public final Lu7/a$c$a;
.super Landroid/database/ContentObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu7/a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LH8/t;


# direct methods
.method constructor <init>(LH8/t;)V
    .registers 2

    iput-object p1, p0, Lu7/a$c$a;->a:LH8/t;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public onChange(Z)V
    .registers 2

    iget-object p0, p0, Lu7/a$c$a;->a:LH8/t;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-interface {p0, p1}, LH8/w;->p(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
