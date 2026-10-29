.class public final LW6/U$e;
.super Lb/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW6/U;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic d:LW6/U;


# direct methods
.method constructor <init>(LW6/U;)V
    .registers 2

    iput-object p1, p0, LW6/U$e;->d:LW6/U;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lb/u;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public d()V
    .registers 1

    iget-object p0, p0, LW6/U$e;->d:LW6/U;

    invoke-static {p0}, LW6/U;->m1(LW6/U;)V

    return-void
.end method
