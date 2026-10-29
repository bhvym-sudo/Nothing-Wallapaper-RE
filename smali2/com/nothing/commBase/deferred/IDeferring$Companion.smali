.class public final Lcom/nothing/commBase/deferred/IDeferring$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/commBase/deferred/IDeferring;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# static fields
.field static final synthetic $$INSTANCE:Lcom/nothing/commBase/deferred/IDeferring$Companion;

.field public static final MAX_DEFERRED_REFRESH_TIME:J = 0x3e8L


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lcom/nothing/commBase/deferred/IDeferring$Companion;

    invoke-direct {v0}, Lcom/nothing/commBase/deferred/IDeferring$Companion;-><init>()V

    sput-object v0, Lcom/nothing/commBase/deferred/IDeferring$Companion;->$$INSTANCE:Lcom/nothing/commBase/deferred/IDeferring$Companion;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
